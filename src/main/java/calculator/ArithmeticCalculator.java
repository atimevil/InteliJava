package calculator;

public class ArithmeticCalculator extends Calculator {
    int num1;
    int num2;
    double result;
    char operator;
    ArithmeticCalculator(int num1, int num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double calculate(int num1, int num2, char operator) {
        if(operator == '+') {
            OperatorType opType = OperatorType.ADD;
            result = opType.operate(num1, num2);
        } else if(operator == '-') {
            OperatorType opType = OperatorType.SUBTRACT;
            result = opType.operate(num1, num2);
        } else if(operator == '*') {
            OperatorType opType = OperatorType.MULTIPLY;
            result = opType.operate(num1, num2);
        } else if(operator == '/') {
            OperatorType opType = OperatorType.DIVIDE;
            if (num2 == 0) {
                return 0; // 보류
            }
            result = opType.operate(num1, num2);
        } else if (operator == '%') {
            OperatorType opType = OperatorType.MOD;
            result = opType.operate(num1, num2);
        }

        return result;
    }
}
//뭔가 지저분한데;
