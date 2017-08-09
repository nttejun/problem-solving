package resolve;

/**
 * Created by nttej on 2017-08-09.
 */
public class StringCalculator {
    public static void main(String[] args) {

        StringCalculator stringCalculation = new StringCalculator();
        stringCalculation.add("3,4,5;0");

    }

    public int add(String testStr) {

        String[] testStrAry;

        if (testStr == null || testStr.isEmpty()) {

            return 1;

        }

        testStrAry = testStr.split(",|;");

        return sum(testStrAry);

    }

    private int sum(String[] testStrAry){

        int testInt = 0;

        for (int index = 0; index < testStrAry.length; index++) {

            testInt = Integer.parseInt(testStrAry[index]) + testInt;

        }

        return testInt;

    }

}

