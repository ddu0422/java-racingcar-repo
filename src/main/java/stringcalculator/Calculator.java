package stringcalculator;

public class Calculator {

    public int plus(int result, int target) {
        return result + target;
    }

    public int minus(int result, int target) {
        return result - target;
    }

    public int multiply(int result, int target) {
        return result * target;
    }

    public int divide(int result, int target) {
        return result / target;
    }

    public String[] splitByBlank(String inputText) {
        return inputText.split(" ");
    }

    public int parseStringToInt(String target) {
        return Integer.parseInt(target);
    }

    public int calculate(int result, String operator, int nextValue) {
        if ( operator.equals("+")) {
            return plus(result, nextValue);
        }

        if ( operator.equals("-")) {
            return minus(result, nextValue);
        }

        if ( operator.equals("*")) {
            return multiply(result, nextValue);
        }

        if ( operator.equals("/")) {
            return divide(result, nextValue);
        }

        return  0;
    }

    public int excute(String[] inputText) {
        int result = parseStringToInt(inputText[0]);

        for (int i = 1; i < inputText.length ; i += 2) {
            result = calculate(result, inputText[i], parseStringToInt(inputText[i + 1]));
        }

        return result;
    }

}
