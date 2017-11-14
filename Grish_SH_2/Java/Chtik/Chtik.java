public class Chtik {
    int count = 0;

    public void add(Products products){
        count += products.getPrice();
        System.out.println(products.getName() + " " +products.getPrice()+ " AMD");
    }

    public int getCount() {
        return count;
    }

}
