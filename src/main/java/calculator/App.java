package calculator;

import java.util.*;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> consequence = new ArrayList<>();
        int count = 0;

        while (true) {
            int a, b;
            char c;
            String d;

            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            b = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            c = sc.next().charAt(0);

            int result = 0;
            if (c == '+')
                result = a + b;
            else if (c == '-')
                result = a - b;
            else if (c == '/')
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    System.exit(0);
                } else result = a / b;
            else if (c == '*')
                result = a * b;
            System.out.println("결과: " + result);
            consequence.add(result);
            count++;
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            d = sc.next();
            if(d.equals("exit")) break;
            if(d.equals("remove")) consequence.remove(0); ;
            if(d.equals("inquiry"))
                for(Integer i : consequence) System.out.println(i);
        }
    }
}