import java.util.*;

public class primee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime =true;
        
        for(int i = 2 ; i < num;i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
       
        //    if(isPrime(num)){
        //     System.out.println("the number is prime");
        // }else{
        //     System.out.println("the number is not a prime");
        // }

        // public static boolean isPrime(num){ 
        // for(int i = 2; i <= num/2; i++){
        //     if(num % i == 0){
        //         return false;

        //     }
        //     return true;  
        // }

        // }

        
    }
}
