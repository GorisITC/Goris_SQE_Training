public class Armat {
    public static void main(String[] argss){
        int a = 36;
        for (int i = 1;i < a;i++){
            if(i * i == a){
		System.out.println(i);
		break;
	    }
	    else if (i * i > a){
	    System.out.println("Trvac tiv@ armat chuni");
	    break;
	    }
        }
    }
}
