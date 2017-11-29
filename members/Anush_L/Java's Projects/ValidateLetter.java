class ValidateLetter {
    public static void main(String[] args) {
        String[] a = new String[] {"Arev", "Terev", "duR", "kanach", "deghin", "Karmir", "Tun"};
        for (String i : a) {    
            if (i.contains("r") || i.contains("R")) {
                System.out.println(i);
            }
        }
    }
}

