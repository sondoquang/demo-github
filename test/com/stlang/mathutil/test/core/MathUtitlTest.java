
package com.stlang.mathutil.test.core;

import com.stlang.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author acer
 */
public class MathUtitlTest {
    
    /**
     * Class sẽ sử dụng để  viết các hàm  của thư viện framework JUnit
     * Class. MathUtil
     * Viết code để test code chính bên kia
     */
    
    
    // Có nhiều quy tắc đặt tên hàm kiểm thử --> nói lên mục đích kiểm thử - theo hướng thành công va thất bại //
    //Hàm chạy thành công//
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        // So sánh dùng framework //
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
       // hàm so sánh 2 giá trị có giống nhau hay không //
       // -> code ngon --> màu xanh
       // --> code ngu --> màu đỏ đèn đường
    }
    
    
    /**
     * Hàm getF(x) ta thiết kế có 2 tình huống xử lý
     * 1. Đưa data tử tế trong [0..20] --> Tính đúng --> Xanh đèn đường
     * 2. Đưa data vào cà chớn, âm, >20 || < 0; Thiết kế hàm ném ra ngoại lệ
     * TAO KÌ VỌNG NGOẠI LỆ  XUẤT HIỆN KHI N < 0  || N > 20
     * --> RẤT MONG NGOẠI LỆ XUẤT HIỆN VỚI N CÀ CHỚN 
     * Nếu hàm nhập vào n > 20 || n < 0 thì hàm đúng bởi vì đang thiết kế hàm cho data sai
     * --> Hàm xuất hiện màu xanh khi hàm được test
     */
    
    // Test case: 
    // Input: -5
    // Expected: IllegalArgumentException xuất hiện
    // Tình huống ngoại lệ, ngoài dự tính là những thứ không thể đo lường và so sánh theo kiểu value
    // Mà chỉ có thể đo lường bằng cách nó có xuất hiện hay không
    // assertEquals() Không thể đáp ứng nhu cầu 
    //      equals(): Là bằng nhau hay không trên value
//    @Test(expected = NumberFormatException.class) // Ngoại lệ đưa ra là NumberFormatException //
//    public void testGetFactorialGivenRightArgumentReturnsException(){
//        MathUtil.getFactorial(-5); // Hàm này chạy phải đưa ra ngoại lệ NumberFormat...
//    }
    
    @Test(expected = IllegalArgumentException.class) // Ngoại lệ đưa ra là NumberFormatException //
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-1); // Hàm này chạy phải đưa ra ngoại lệ NumberFormat...
    }
    
    
    
    // CÁCH KHÁC KHI BẮT NGOẠI LỆ, VIẾT TỰ NHIÊN HƠN //
    // BIỂU THỨC LAMDA EXPRESSTION
    // Test case: Hàm ném ra ngoại lệ nếu nhận vào 21
    // Tui cần thấy màu xanh khi n = 21 --> màu xanh đèn đường
    @Test // Ngoại lệ đưa ra là NumberFormatException //
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
/**        Assert.assertThrows( Tham số 1: <Loại ngoại lệ muốn bắt>, 
*                            Tham số 2: <Đoạn code chạy văng ra ngoại lệ>)
*/      
        Assert.assertThrows(IllegalArgumentException.class,
                            () -> MathUtil.getFactorial(-21));
//        MathUtil.getFactorial(2); // Hàm này chạy phải đưa ra ngoại lệ NumberFormat...
    }
    
    // Xem hàm có ném về ngoại lệ hay không nếu n cà chớn --> có ném --> Hàm thực hiện đúng
    @Test // Ngoại lệ đưa ra là NumberFormatException //
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        // Chủ động kiểm soát ngoại lệ //
        try {
            MathUtil.getFactorial(-22);
        } catch (Exception e) {
            // Băt try catch là JUnit sẽ ra màu xanh vì đã bắt ngoại lệ nhưng không biết có ngoại lệ hay không
            //Có đoạn code  kiểm soát đúng ngoại lệ hay không.
            Assert.assertEquals("Invalue argument. N must be between 0..20", e.getMessage());
        }
    }
    
}
