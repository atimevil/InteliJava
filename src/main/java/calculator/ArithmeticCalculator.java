package calculator;

public class ArithmeticCalculator extends Calculator {
    int num1, num2, result;
    char operator;
    ArithmeticCalculator(int num1, int num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    AddOperator add = new AddOperator();
    SubtractOperator sub = new SubtractOperator();
    MultiplyOperator mul = new MultiplyOperator();
    DivideOperator div = new DivideOperator();

    public int calculate(int num1, int num2, char operator) {
        if(operator == '+') {
            result = add.operate(num1, num2);
        } else if(operator == '-') {
            result = sub.operate(num1, num2);
        } else if(operator == '*') {
            result = mul.operate(num1, num2);
        } else if(operator == '/') {
            if (num2 == 0) {
                return 0; // 보류
            }
            result = div.operate(num1, num2);
        }

        return result;
    }
}

