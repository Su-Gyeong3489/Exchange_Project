package moneyExchange;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scanner = null; //null�� �ʱⰪ ����(Scanner scanner;�� �Ͽ��� ����)  
	InputFromConsoleClass() { //won�� type�� ���� �� �ֵ��� ������ 
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() { //scanner �Ҹ� 
		scanner.close();
	}
	//'ȯ���� �ݾ�(��)'�� 'ȯ���� ����' �Է� �ޱ� 
	public int inputWon() {

		int won;
		System.out.println("[���� ��ȭ �Է�] : "); //int�� �ص� ���� 
		won = scanner.nextInt();
		return won;
	}
	public int inputType() {
		int type;
		System.out.println("[ȯ���� ���� ����] (0: ���� 1:USD, 2:EUR, 3:JPY) ?");
		type = scanner.nextInt();
		return type;
	}
	
}
