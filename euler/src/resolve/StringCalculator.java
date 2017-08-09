package resolve;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

/**
 * Created by nttej on 2017-08-09.
 */
public class StringCalculator {
    public static void main(String[] args) {

        StringCalculator stringCalculation = new StringCalculator();

        stringCalculation.textAdd("3,4,5;0");

    }

    public int textAdd(String inputText) {

        if (isBlank(inputText)) {

            return 0;

        }

        return toIntSum(textSplit(inputText));

    }

    private boolean isBlank(String inputText) {

        return inputText == null || inputText.isEmpty();

    }

    private String[] textSplit(String inputText) {

        return inputText.split(",|;");

    }

    private int toIntSum(String[] inputTextAry) {

        int testInt = 0;

        for (int index = 0; index < inputTextAry.length; index++) {

            testInt = Integer.parseInt(inputTextAry[index]) + testInt;

        }

        return testInt;

    }

}