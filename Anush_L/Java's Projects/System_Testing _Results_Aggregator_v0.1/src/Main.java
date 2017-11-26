
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List <RequestGroup> requestGroups = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        try {
        	FileReader reader=new FileReader("/home/anush/Desktop/requests.csv");
        BufferedReader bf = new BufferedReader(reader);
        String line;
        String[] values;
        while ((line=bf.readLine()) !=null){
            boolean isGroupExist = false;
            Request rf = new Request();
            values = line.split(",");
                rf.setName(values[0]);
                rf.setTime(Double.parseDouble(values[1]));
                rf.setDuration(Double.parseDouble(values[2]));
                rf.setCode(Integer.parseInt(values[3]));
            for (int i = 0; i < requestGroups.size(); i++) {
                if (requestGroups.get(i).getName().equals(rf.getName())) {
                    requestGroups.get(i).add(rf);
                    isGroupExist = true;
                }
            }

            if (!isGroupExist) {
            	requestGroups.add(new RequestGroup(rf));
            }

            }
        bf.close();
        
        Calculation.getAverageDurationTotal(requestGroups);
        Calculation.getStandardDeviationTotal(requestGroups);
        Calculation.errorRate(requestGroups);
        } catch (FileNotFoundException e) {
        	System.out.println("File not found.");
        } catch (NumberFormatException e) {
        	System.out.println("Data does not have correct format.");
        }
    }
}
