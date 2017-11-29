public class Decimel {
    public static void main(String[] args) {


        int array[] = {1, 0, 1};
        int lastIndexOfArray = array.length - 1;
        int decimalNumber = 0;
        for (int i = 0; i < array.length / 2; i++) {

            int c = array[i];
            array[i] = array[lastIndexOfArray];
            array[lastIndexOfArray] = c;
            lastIndexOfArray--;
           }
        for (int j = 0; j <array.length ; j++) {
            int quadratic=1;

            for (int i = 0; i < j ; i++) {
                quadratic*=2;
            }
            decimalNumber += array[j] * quadratic;
        }


        System.out.println(decimalNumber);


    }
}




