package moneyExchange;

import java.io.IOException;
import java.util.Scanner;

public class MoneyExchange {

	public static void main(String[] args) throws IOException {
		 		
		Scanner scan = new Scanner(System.in);                                //1. Scanner 열기 		   	
		InputFromConsoleClass InputFromConsole = new InputFromConsoleClass(); //1-1. 클래스 InputFromConsoleClass를 불러 'won'과 'type' 입력값  	
		
		ExchangeType exType = new ExchangeType();                            //2. 클래스 ExchangeType 부르기(변수)
		ProcessingClass pc = new ProcessingClass();                          //3. 클래스 ProcessingClass(계산과정) 부르기
		CsvOutput csvOutput = new CsvOutput();                                  //4. 클래스 CsvOutput(csv 파일에 출력) 부르기
		
		csvOutput.headerWrite();                                                //1) 클래스 CsvOutput의 header 출력 (while 밖에 두어 반복 방지) 
		
		while(true) {
						
			exType.won = InputFromConsole.inputWon();                       //2) 클래스 ExchangeType의 변수와      
			exType.type = InputFromConsole.inputType();                     //   클래스 InputFromConsole 입력값과 연결 
						
			if (exType.type == ConstValueClass.EX_TYPE_USD) {             //3) InputFromConsole 입력값과 클래스 ConstValueClass 연결하기    
				exType.ExchType = "USD";                                    //3-1) InputFromConsole 입력값과 ExchangeType 변수와 연결하기
				exType.cw = pc.exchangeUSD(exType.won);	                    //3-2)ProcessingClass의 exchangeUSD 리턴값에 대한 정의  
	            
			} else if (exType.type == ConstValueClass.EX_TYPE_EUR) {
				exType.ExchType = "EUR"; 
				exType.cw = pc.exchangeEUR(exType.won);    			
				
			} else if (exType.type == ConstValueClass.EX_TYPE_JPY)	{
				exType.ExchType = "JPY";
				exType.cw = pc.exchangeJPY(exType.won); 				
				
			} else if(exType.type == ConstValueClass.EX_TYPE_EXIT) {     //4) type 입력값이 0이면 종료  
				break;                                                     
			}

			pc.returnWon();                                                //5) ProcessingClass의 returnWon()   
			csvOutput.printResult(exType.won, exType.ExchType, exType.cw[0], exType.cw[1]); //6-1) 클래스 ProcessingClass에서 변수값 계산   			
		}                                                                  //6-2) 클래스 ExchangeType 변수에 저장 6-3) CsvOutPut의 printResult 수행
		scan.close(); //0을 2번 입력하여 종료(csv 저장/0: 종료)    
		csvOutput.fileClose(); //fileClose로 csv파일 저장  	
	}
}	