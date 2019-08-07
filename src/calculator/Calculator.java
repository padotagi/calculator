package calculator;
import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 입력 값 : ");
		int first = scanner.nextInt();		
		System.out.println(first);
		
		int result = first;		
		while (true) {
			System.out.println("사칙연산 기호 : ");
			String symbol = scanner.next();
			System.out.println(symbol);
				
			if ("quit".equals(symbol)) {
				System.out.println("최종 결과 값: " +result);
				break;
			}	
			System.out.println("다음 입력  : ");
			int second = scanner.nextInt();
			System.out.println(second);
			
			if (symbol.equals("+")) {
				result = result + second;
				System.out.println("덧셈 : " + result);
			} else if ("-".equals(symbol)) {
				result = result - second;
				System.out.println("뺄셈 : " + result);		
			} else if ("*".equals(symbol)) {
				result = result * second;
				System.out.println("곱셈 : " + result);
			} else if ("/".equals(symbol)) {	
				result = result / second;
				System.out.println("나눗셈 : " + result);
			} else {
			System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");	

		}
		
		
	}
   }
}
  
