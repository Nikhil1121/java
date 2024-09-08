public class fabonaci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int count = 10;
        System.out.println(num1 + " " + num2);
        for(int i = 0 ; i < count;++i){
            int num3 = num1 + num2;
            System.out.println(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
