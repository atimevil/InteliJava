package calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> resultsArith;
    private ArrayList<Double> resultsCircle;
    private int count;
    private int num1, num2, result;
    private char operator;
    private int radius;

    public double calculate(int a, int b, char oper) throws OperExcept, NumExcept {
        this.num1 = a; //이거 이제 안쓰는거 아닌가? 아니넹
        this.num2 = b;
        this.operator = oper;
        switch (oper) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new NumExcept("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                return a / b;
            case '%':
                return a % b;
            default:
                throw new OperExcept("제대로 된 연산기호를 입력하세요.");
        }
    }

    public double calculateCircleArea(int radius) {
        this.radius = radius;
        return radius * radius * 3.14;
    }

    public Calculator() {
        this.resultsArith = new ArrayList<Double>();
        this.resultsCircle = new ArrayList<>();
        this.count = 0;
    }

    public void removeResultArith() {
        resultsArith.remove(0);
        count--;
    }

    public void addResultArith(double result){
        resultsArith.add(result);
        count++;
    }

    public void printResultArith() {
        for(Double i : resultsArith) {
            System.out.println(i);
        }
    }

    public void removeResultCircle() {
        resultsCircle.remove(0);
        count--;
    }

    public void addResultCircle(double result){
        resultsCircle.add(result);
        count++;
    }

    public void printResultCircle() {
        for(Double i : resultsCircle) {
            System.out.println(i);
        }
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1() {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setB() {
        this.num2 = num2;
    }

    public char getOperator() {
        return this.operator;
    }

    public char setOperator(char operator) {
        return operator;
    }
}
