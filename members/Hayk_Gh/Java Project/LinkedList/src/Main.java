public class Main {
    public static void main(String[] args) {
        LinkdList<String> linkdList = new LinkdList<>();
        linkdList.add("Hi");
        linkdList.add("Hello");
        linkdList.add("Barev");
        linkdList.add("Good");
        linkdList.add("Bye");
        linkdList.add("Goodbye");
        try {
            System.out.println(linkdList.get(99));
            System.out.println(linkdList.indexOf("asdfasdfa"));
            linkdList.remove(2);
            linkdList.remove(0);
            for (int i = 0;i<linkdList.length();i++){
                System.out.println(linkdList.get(i));
            }
            System.out.println(linkdList.getLast());
        } catch (Exception e)  {
            e.printStackTrace();
        }

    }
}
