import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JSONData {

    HashMap<String, HashMap> datas = new HashMap<String, HashMap>();
    HashMap<String, String> data = new HashMap<String, String>();
    FileReader reader;
    BufferedReader bf;
    boolean contains = false;

    JSONData (String fileName) throws IOException {
        readData(fileName);
    }

    public void readData(String fileName) throws IOException {
        reader = new FileReader(fileName);
        bf = new BufferedReader(reader);
        String line;
        String[] linElement;

        while ((line = bf.readLine()) != null) {
            linElement = line.split(": ");
            if (linElement.length > 1) {
                if (linElement[1].contains("{")) {
                    writeData(line, linElement[0]);
                } else {
                    data.put(linElement[0], linElement[1]);
                }
            }
        }
        bf.close();
    }

    public HashMap writeData(String line, String key) throws IOException {
        HashMap<String, String> element = new HashMap<String, String>();
        String[] elementKey;
        while ((line = bf.readLine()) != null) {
            elementKey = line.split(": ");
            if (elementKey.length > 1) {
                if (elementKey[1].contains("{")) {
                    datas.put(key, datas.put(elementKey[0], writeData(line, elementKey[0])));
                } else {
                    datas.put(key, element);
                    String[] value = elementKey[1].split(",");
                    element.put(elementKey[0], value[0]);
                }
            } else if (elementKey[0].contains("}")) {
                return datas.put(key, element);
            }
        }
        throw new NumberFormatException();
    }

    public void searchDatas(HashMap<String, HashMap> datas, String find) {
        for (Map.Entry<String, HashMap> elements : datas.entrySet()) {
            HashMap<String, String> element = elements.getValue();
            String[] key = elements.getKey().split("\"");
            if (find.equals(key[1])) {
                System.out.println(elements.getKey() + ": " + elements.getValue());
                contains = true;
            }
            searchData(element, find);
        }
    }

    public void searchData(HashMap<String, String> data, String find) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String[] key = entry.getKey().split("\"");
            if (find.equals(key[1])) {
                contains = true;
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public void findData(String find) {
        searchDatas(datas, find);
        searchData(data, find);
        if (!contains) {
            System.out.println("Data is not found.");
        }
    }
}
