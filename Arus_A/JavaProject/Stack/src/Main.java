import javax.xml.validation.TypeInfoProvider;
import java.io.UncheckedIOException;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        try{
                Stack st1 = new Stack(2);
                System.out.println("Մուտքագրեք, խնդրեմ, զանգվածի հերթական անդամին․");
            for (int i = 0; i < 0; i++) {
                st1.push(input.next());
            }
                //st1.tpelGeneralInfo();
                //st1.tpelCurrentStack();
            System.out.println(st1.peek());
            System.out.println(st1.pop());
            System.out.println(st1.peek());

            //   st1.tpelCurrentStack();
            }
            catch (NegativeArraySizeException e) {
                System.out.println(e.getMessage());
            }
            catch (OutOfMemoryError e){
                System.out.println(e.getMessage());
            }
    }
}
