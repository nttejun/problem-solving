package resolve;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

/**
 * Created by nttej on 2017-08-09.
 */
public class StringCalculator {
    public static void main(String[] args) {

        StringCalculator stringCalculation = new StringCalculator();

        stringCalculation.textAdd("//,\n2,4,3");

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

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(inputText);

        if(matcher.find()){

            return matcherSplit(inputText, matcher);

        }

        return inputText.split(",|;");

    }

    private String[] matcherSplit(String inputText, Matcher matcher){

        String customerDelimeter = matcher.group(1);

        String test[] = matcher.group(2).split(customerDelimeter);

        return matcher.group(2).split(customerDelimeter);

    }


    private int toIntSum(String[] inputTextAry) {

        int testInt = 0;

        for (int index = 0; index < inputTextAry.length; index++) {

            testInt = Integer.parseInt(inputTextAry[index]) + testInt;

        }

        System.out.println(testInt);

        return testInt;

    }

}