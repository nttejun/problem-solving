package baekjoon;

/***
 * 2199년 7월 2일
 * 무슨 요일인지 구하시오
 */

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/***
 * if ((year % 4 == 0) && (year % 100 != 0))
 * then 윤년
 * if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
 * then 윤년
 */


public class BaekjoonBookFindDay21990702 {


    private String checkYear(int year, String result) {
        if(((year % 4 == 0) && (year % 100 != 0)) || ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))) result = "윤년";
        return result;
    }

    @Test
    public void TEST_CHECK_YEAR1(){
        int year = 1952;
        String result = "평년";
        result = checkYear(year, result);
        assertEquals("윤년", result);
    }

    @Test
    public void TEST_CHECK_YEAR2(){
        int year = 2008;
        String result = "평년";
        result = checkYear(year, result);
        assertEquals("윤년", result);
    }

    @Test
    public void TEST_CHECK_YEAR3(){
        int year = 2120;
        String result = "평년";
        result = checkYear(year, result);
        assertEquals("윤년", result);
    }

    @Test
    public void TEST_CHECK_COMMON_YEAR1(){
        int year = 2100;
        String result = "평년";
        result = checkYear(year, result);
        assertEquals("평년", result);
    }

    @Test
    public void TEST_CHECK_COMMON_YEAR2(){
        int year = 2018;
        String result = "평년";
        result = checkYear(year, result);
        assertEquals("평년", result);
    }
}
