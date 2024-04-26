package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        while (true) {
            int option;

            System.out.println("원의 넓이 구하기(1), 사칙연산하기(2)");
            System.out.print("Enter option: ");
            option = sc.nextInt();

            if (option == 1) {

                int radius;
                double result;
                String reOption;
                System.out.print("원의 반지름을 입력하시오: ");
                radius = sc.nextInt();
                CircleCalculator calRadius = new CircleCalculator(radius);
                result = calRadius.calculate(radius);
                System.out.println("결과: " + result);
                calc.addResultCircle(result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

                reOption = sc.next();
                if (reOption.equals("exit")) break;
                if (reOption.equals("remove")) calc.removeResultCircle();
                if (reOption.equals("inquiry")) calc.printResultCircle();

            } else if (option == 2) { //switch가 더 예뻐보임
                int num1, num2;
                char oper;
                String reOption;

                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                oper = sc.next().charAt(0);


                ArithmeticCalculator calArith = new ArithmeticCalculator(num1, num2, oper);

                int result = 0;
                result = calArith.calculate(num1, num2, oper);
                System.out.println("결과: " + result);
                calc.addResultArith(result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

                reOption = sc.next();
                if (reOption.equals("exit")) break;
                if (reOption.equals("remove")) calc.removeResultArith();
                if (reOption.equals("inquiry")) calc.printResultArith();
            }
        }
    }
}