// Pls write comments what should do the code 
// Class name should be a noun
// Camel style: pls write all words in class name with the upper case e.g RemovingDupNumbers

public class Removingdupnumbers {


    public static void main(String[] args) {

        int[] a = {1,3,5,2000,5,1,5,5,5,5,5,5};
        // Pls define properties not early than you should use it
        int i;
        int j;

        System.out.println("Here are remaining values of an array");
        for (i = 0; i < a.length; i++) {
            boolean d = true;
            // pls optimise the circle
            for (j = 0; j < a.length; j++) {
                if (a[i] == a[j] && j != i) {
                    // why do you have a boolean property you can remove the  duplicates here
                    d = false;
                }

            }
            //you should remove the duplications from array (not print)
            if (d) {
                System.out.println(a[i]);
            }
        }
    }
}

