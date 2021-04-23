package moneyExchange;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scanner = null; //null로 초기값 설정(Scanner scanner;로 하여도 무방)  
	InputFromConsoleClass() { //won과 type을 받을 수 있도록 열어줌 
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() { //scanner 소멸 
		scanner.close();
	}
	//'환전한 금액(원)'과 '환전할 종류' 입력 받기 
	public int inputWon() {

		int won;
		System.out.println("[받은 원화 입력] : "); //int로 해도 무방 
		won = scanner.nextInt();
		return won;
	}
	public int inputType() {
		int type;
		System.out.println("[환전할 종류 선택] (0: 종료 1:USD, 2:EUR, 3:JPY) ?");
		type = scanner.nextInt();
		return type;
	}
	
}
