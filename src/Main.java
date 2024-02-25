public class Main {
    public static void main(String[] args) {
        Stacks stack = new Stacks();
        stack.push(23);
        stack.push(22);
        stack.push(1);
        boolean result = stack.isEmpty();
        System.out.println(result);
    }
}