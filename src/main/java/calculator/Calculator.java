package calculator;

public class Calculator {
    int a, b, result;
    char oper;

    public int calculate(int a, int b, char oper) throws OperExcept, NumExcept {
        this.a = a;
        this.b = b;
        this.oper = oper;
        switch (oper) {
            case '+' :
                return a + b;
            case '-' :
                return a - b;
            case '*' :
                return a * b;
            case '/' :
                if(b == 0) {
                    throw new NumExcept("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                return a / b;
            default:
                throw new OperExcept("제대로 된 연산기호를 입력하세요.");
        }
    }
    public int getA(){
        return a;
    }
    public void setA(){
        this.a = a;
    }
    public int getB(){
        return b;
    }
    public void setB(){
        this.b = b;
    }
}