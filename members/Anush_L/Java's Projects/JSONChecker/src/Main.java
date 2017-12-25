import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {

            JSONData fileJSON = new JSONData("/home/anush/Desktop/JSONFile");
            fileJSON.findData("window");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (NumberFormatException e) {
            System.out.println("Data does not have correct format.");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
