package calculator;
import java.util.*;

public class Calculator {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("첫번째 값: ");
	int first = scanner.nextInt();
	System.out.println(first);
	
	System.out.println("사칙연산 기호: ");
	String symbol = scanner.next();
	System.out.println(symbol);

	System.out.println("두번째 값: ");
	int second = scanner.nextInt();
	System.out.println(second);
	
	if (symbol.equals("+")) {
		System.out.println("덧셈: " + (first + second));
	} else if ("-".equals(symbol)) {
		System.out.println("뺄셈: " + (first - second));
	} else if ("*".equals(symbol)) {
		System.out.println("곱셈: " + (first * second));
	} else if ("/".equals(symbol)) {	
		System.out.println("나눗셈: " + (first / second));
	} else {
	System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");	
		}
	}
}
