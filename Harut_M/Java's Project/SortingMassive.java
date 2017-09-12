public class SortingMassive {
    public static void main(String[] args) {

        int array[] = {5, 6, 8, 4, 12, 0, -87};
        int startingNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = startingNumber; j < array.length-1; j+=2) {
                if (array[j] > array[j + 1]) {
                    int secondValue = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = secondValue;
                }

            }
            if (startingNumber == 0) {
                startingNumber = 1;
            } else {
                startingNumber = 0;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }
    }
}

