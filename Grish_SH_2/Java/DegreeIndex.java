public class DegreeIndex {
    public static void main(String[] argss){
        int a = 32;
        int tiv = 1;
        for (int i = 0;i <= a/2;i++){
            if (tiv == a){
                System.out.println(a + "-ի աստիճանի ցուցիչը հավասար է " + i);
            break;
            }
             if(tiv > a){
                System.out.println("Թիվը 2֊ի աստիճան չէ");
                break;
            }
            tiv*=2;
        }
    }
}
