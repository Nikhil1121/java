public class reverseString {
    public static void main(String[] args) {
        String str = "bawa";
        // StringBuinder sb = new StringBuilder(str);
        StringBuilder reversed =new StringBuilder(str).reverse();
        System.out.println(reversed);
    }
}
