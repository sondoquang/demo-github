package com.stlang.mathutil.test.core;

import com.stlang.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author acer
 */
// Biến class này thày class tham số hóa //
// Báo hiệu rằng cần loop qua các tập data để feed vào các hàm //
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    /**
     *
     * @return mảng 2 chiều gồm nhiều cặp expected và actual
     */
    @Parameterized.Parameters // JUnit ngầm chạy loop qua từng dòng của mảng để lấy ra được cặp data input expected @Mới là quan trọng
    public static Object[][] initData() {
        // [input][expected]
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720},
            {7, 5040},
            {8, 40320},
            {9, 362880},
        };
    }

    // Giản s loop qua từng giá trị rồi ta cẩn phải gán từng value của cột
    //vào biên tương ứng input, expected để xí nữa feed 
    @Parameterized.Parameter (value = 0) // map với mảng data cột 0 -->>::))
    public int actual; // Biến  map với value của cột 0 trong mảng
    @Parameterized.Parameter (value = 1) // map với mảng data cột 1 -->>::))
    public long expected; // Biến long vì giá trị expected khá lớn
    
    
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        Assert.assertEquals(expected, MathUtil.getFactorial(actual));
    }
}
