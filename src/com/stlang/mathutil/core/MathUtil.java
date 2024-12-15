
package com.stlang.mathutil.core;

/**
 *
 * @author acer
 */
public class MathUtil {
    
    /*  Class cung cấp cho người dùng nhiều hàm xử lý toán học
        . Clone class Math củ JDK
        . Hàm thư viện sài chung cho ai đó mà không lưu lại giá trị
    */
    
    /* Hàm tính giai thừa */
    // n! = 1*2*3*....*n
    // Không có giai thừa cho số âm
    // 0! = 1! = 1
    // Giai thừa là hàm tăng rất nhanh về giá trị
    // 20 giai thừa là 8 con số 0 , vừa kịp đủ kiểu dữ liệu long trong Java
    public  static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalue argument. N must be between 0..20");
        }
        if(n == 0 || n == 1){
            return 1; // Kết thúc sớm để nhận những điều kiện đặc biệt
        }
        long product = 1; // Ốc bưu dồn thịt
        for (int i = 2; i <=n; i++) 
            product *= i;
        return product;
    }
}
