public class swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a = a+b;
        b= a-b;
        a = a-b;
        System.out.println("swapping after a =" + a + ", b =" + b );
    }
}
