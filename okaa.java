import java.util.Scanner;

public class okaa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int marks =sc.nextInt();

        if(marks < 29){
            System.out.println("padh leta yrr bhai fail ho gya");
            System.out.println("grade le tu Z");
        }
        else if(marks == 29){
              System.out.println("bach gya boundary par pass ho gya bsdk tu");
              System.out.println("your grade is D");
           }
          else if(marks > 29){
            System.out.println("pass ho gya beta tu to");
            System.out.println("your grade is c");
          }
          else if( marks > 40){
            System.out.println("pass ho gya beta tu to");
            System.out.println("your grade is B");
          }
          else {
            System.out.println("pass bro ");
            System.out.println("your grade is A");
          }
             // System.out.println();
        }
    }


