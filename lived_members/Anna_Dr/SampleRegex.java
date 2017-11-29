import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class SampleRegex {
    public static void main(String[] args) {
        String s = "name35, nameA, name1, name, namme2, anun, anun1, anun2, imya, imya1, imya2";
        Pattern regex = Pattern.compile("[A-Za-z]{0,}[0-9]{1,}[A-Za-z]{0,}");
        Matcher regexMatcher = regex.matcher(s);
        while (regexMatcher.find()) {
            System.out.println(regexMatcher.group() + ", ");
        } 
    }
}
