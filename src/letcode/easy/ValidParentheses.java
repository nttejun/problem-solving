package letcode.easy;

import common.Stack;
import org.junit.Assert;
import org.junit.Test;

public class ValidParentheses {


  private boolean validParentheses(String s) {
    Stack<String> stack = new Stack();

    for (int i = 0; i < s.length(); i++) {

      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        stack.push(String.valueOf(s.charAt(i)));
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        switch (String.valueOf(s.charAt(i))) {
          case ")":
            if (!stack.pop().equals("(")) {
              return false;
            }
            break;
          case "}":
            if (!stack.pop().equals("{")) {
              return false;
            }
            break;
          case "]":
            if (!stack.pop().equals("[")) {
              return false;
            }
            break;
          default:
            return false;
        }
      }
    }

    if (stack.isEmpty()) {
      return true;
    }
    return false;
  }

  @Test
  public void valid() {
    ValidParentheses validParentheses = new ValidParentheses();
    String trueSample1 = "(({}))";
    String falseSample1 = "(}))";
    String trueSample2 = "(){}";
    Assert.assertTrue(validParentheses.validParentheses(trueSample1));
    Assert.assertTrue(validParentheses.validParentheses(trueSample2));
    Assert.assertFalse(validParentheses.validParentheses(falseSample1));
  }
}
