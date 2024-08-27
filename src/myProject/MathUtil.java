
package myProject;



public class MathUtil {
    
    // n! = 1.2.3.....n
    // Qui uoc: 0! = 1! = 1
    // khoong tinh ! cho so am
    // 20! trong Java vua khop voi kieu long
    public static long getFactorial(int n){
        if(n > 20 || n < 0)
            throw new IllegalArgumentException("Invalid argument .n must be between 0 and 20");
            // Hàm dừng luôn méo cần return 
        if(n == 0 || n == 1)
            return 1;
        long product = 1;
        for(int i=2 ; i<=n ; i++)
            product *= i;
        return product;
    }
    
}
