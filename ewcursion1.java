public class ewcursion1 {
    public static int calcpower(int n , int x){
        if(n == 0){  //base case 1
            return 1;
        }
        if(x == 0){   //base case 2
            return 0;
        }
        int xPownm1 = calcpower (x , n-1);    //(work ky krna h )
        int xPown = x * xPownm1;
        return xPown;

    }
    public static void main(String[] args) {
        int x = 2 , n = 5;
        int ans = calcpower(n, x);
        System.out.println(ans); 
    }
}
