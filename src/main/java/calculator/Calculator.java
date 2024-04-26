package calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> results;
    private int count;
    private int a, b, result;
    private char oper;

    public int calculate(int a, int b, char oper) throws OperExcept, NumExcept {
        this.a = a;
        this.b = b;
        this.oper = oper;
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
            default:
                throw new OperExcept("제대로 된 연산기호를 입력하세요.");
        }
    }

    public Calculator() {
        this.results = new ArrayList<>();
        this.count = 0;
    }

    public void removeResult() {
        results.remove(0);
        count--;
    }

    public void addResult(int result){
        results.add(result);
        count++;
    }

    public void printResult() {
        for(Integer i : results) {
            System.out.println(i);
        }
    }

    public int getA() {
        return a;
    }

    public void setA() {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB() {
        this.b = b;
    }

    public char getOper() {
        return this.oper;
    }

    public char setOper(char oper) {
        return oper;
    }
}