package moneyExchange;

import java.io.IOException;
import java.util.Scanner;

public class MoneyExchange {

	public static void main(String[] args) throws IOException {
		 		
		Scanner scan = new Scanner(System.in);                                //1. Scanner ���� 		   	
		InputFromConsoleClass InputFromConsole = new InputFromConsoleClass(); //1-1. Ŭ���� InputFromConsoleClass�� �ҷ� 'won'�� 'type' �Է°�  	
		
		ExchangeType exType = new ExchangeType();                            //2. Ŭ���� ExchangeType �θ���(����)
		ProcessingClass pc = new ProcessingClass();                          //3. Ŭ���� ProcessingClass(������) �θ���
		CsvOutput csvOutput = new CsvOutput();                                  //4. Ŭ���� CsvOutput(csv ���Ͽ� ���) �θ���
		
		csvOutput.headerWrite();                                                //1) Ŭ���� CsvOutput�� header ��� (while �ۿ� �ξ� �ݺ� ����) 
		
		while(true) {
						
			exType.won = InputFromConsole.inputWon();                       //2) Ŭ���� ExchangeType�� ������      
			exType.type = InputFromConsole.inputType();                     //   Ŭ���� InputFromConsole �Է°��� ���� 
						
			if (exType.type == ConstValueClass.EX_TYPE_USD) {             //3) InputFromConsole �Է°��� Ŭ���� ConstValueClass �����ϱ�    
				exType.ExchType = "USD";                                    //3-1) InputFromConsole �Է°��� ExchangeType ������ �����ϱ�
				exType.cw = pc.exchangeUSD(exType.won);	                    //3-2)ProcessingClass�� exchangeUSD ���ϰ��� ���� ����  
	            
			} else if (exType.type == ConstValueClass.EX_TYPE_EUR) {
				exType.ExchType = "EUR"; 
				exType.cw = pc.exchangeEUR(exType.won);    			
				
			} else if (exType.type == ConstValueClass.EX_TYPE_JPY)	{
				exType.ExchType = "JPY";
				exType.cw = pc.exchangeJPY(exType.won); 				
				
			} else if(exType.type == ConstValueClass.EX_TYPE_EXIT) {     //4) type �Է°��� 0�̸� ����  
				break;                                                     
			}

			pc.returnWon();                                                //5) ProcessingClass�� returnWon()   
			csvOutput.printResult(exType.won, exType.ExchType, exType.cw[0], exType.cw[1]); //6-1) Ŭ���� ProcessingClass���� ������ ���   			
		}                                                                  //6-2) Ŭ���� ExchangeType ������ ���� 6-3) CsvOutPut�� printResult ����
		scan.close(); //0�� 2�� �Է��Ͽ� ����(csv ����/0: ����)    
		csvOutput.fileClose(); //fileClose�� csv���� ����  	
	}
}	