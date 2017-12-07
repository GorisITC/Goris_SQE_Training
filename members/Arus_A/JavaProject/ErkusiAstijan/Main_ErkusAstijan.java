public class Main_ErkusAstijan {
    public static void main(String args[]){
        int n=131072;
        int sahman=1;
        int parb=2;
        int count=1;

        for (int i = 0; i < sahman; i++) {
            if(parb*2!=n){
                parb=parb*2;
                sahman++;
                count++;
                if(parb*2>n){
                    System.out.println("Թիվը երկուսի աստիճան չի");
                    break;
                }
            }
            else{
                count++;
                System.out.println(n + " թիվը 2֊ի " + count + " աստիճանն է");
            }

        }
    }
}
