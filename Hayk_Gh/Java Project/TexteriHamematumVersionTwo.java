public class TexteriHamematumVersionTwo {
    public static void main(String[] args){

        String a = "Haruti";
        String b = "Harvt";
        boolean k = true;
        if (a.length() == b.length()){
            for (int i = 0;i<a.length();i++){
                if (a.charAt(i)!= b.charAt(i)){
                    k = false;
                    break;
                }
            }
            System.out.println(k);
        }else{
            System.out.println(!k);
        }
    }
}
