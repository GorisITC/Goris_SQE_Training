public class FifaPes {
    public static void main(String[] args) {

      int x = 16;
      int sum = 0;

               for (int i = 0;i<x;i++){

                    if (i%3 == 0 && i%5 == 0){
                        sum+=i;
                    }
               }
        System.out.println("Ստորև ներկայացված են այն բոլոր թվերի գումարը որոնք բաժանվում են և 3-ի և 5-ի վրա և փոքր են տրված N բնական թվից");
        System.out.println(sum);
    }
}


















