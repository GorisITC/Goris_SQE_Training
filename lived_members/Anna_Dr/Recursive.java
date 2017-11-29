class Recursive {
    public static int myFactorial(int integer) {
        if (integer == 1) {
            return 1;
        }
        else {
            return ( integer*( myFactorial ( integer - 1 ) ) );
        }
    }

    public static void main(String[] args){
        int rec = myFactorial ( 9 );
            System.out.println(rec);
        int rec1 = myFactorial ( 8 );
            System.out.println (rec1);
        }

}

