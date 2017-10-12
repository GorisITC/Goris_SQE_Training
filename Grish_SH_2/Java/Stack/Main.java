public class Main {
    public static void main(String[] args) {
        try{
            Stack stack = new Stack(7);
            stack.push("ghdfhjgjh");
            stack.push("ghdfhjgjh");
            stack.push("ghdfhjgjh");
            stack.push("ghdfhjgjh");
            stack.push("ghdfhjgjh");
            System.out.println(stack.isFull());
        } catch (NegativeArraySizeException e){
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
