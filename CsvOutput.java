package moneyExchange;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CsvOutput {	        //csv���� ����ϴ� Ŭ���� 
	
	private FileWriter fw;         //FileWriter�� �������� fw 
	private boolean IfFileExists; //�������� IfFileExists�� ��������Ȯ���� true�� false�� ������ �Ǵ�  
		
	public CsvOutput() {
		ExchangeType exType = new ExchangeType(); //1. (��ü ����)Ŭ���� ExchangeType�� ����� ������ �������� ���� ��ȯ    
		
		try {                                          //try, catch�� ���� ó��  
			File file = new File("result.csv");   //2. (��ü ����)result.csv ����  	
			if (file.exists() == false) {        //3. �ش� ������ �������� ������   
				IfFileExists = false;             //  IfFileExists�� false�� �����Ѵ�(#41) 
			} else {
				IfFileExists = true;              //4. �ش� ������ �����ϸ� 
			}		                               //  IfFileExists�� true�� �����Ѵ�
			fw = new FileWriter("result.csv", true); //FileWriter�� ���� 
			
		} catch (IOException e) {                  //����ó��(���� ����) 
			e.printStackTrace();
		}
	}
	
	public void fileClose() {                    //fw.close()�� csv���� ����
		try {
			fw.close();
		}	catch (IOException e) {
			e.printStackTrace();	
		}
	}
	   	
	public void headerWrite() throws IOException { //header ���(����: ������ �����ϸ� header ������� ����) 

		if (IfFileExists== false) {
			String header = "��¥," + "ȯ���� �ݾ�(��),"+ "ȯ�����," + "ȯ�����," + "�Ž�����(��)" +","+"\n";
			fw.write(header); //���� ���� 

		}
		
	}
	//�ش� ������ Ŭ���� main���� �޾ƿ���(MoneyExchange #41)   	
	public void printResult(int won, String ExchType, double exchangeResult, double changeWonResult) throws IOException  {

		Calendar cal = Calendar.getInstance(); 
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String field = sdf.format(cal.getTime()) + "," + String.valueOf(won) + "," + ExchType + "," +
		String.valueOf(exchangeResult) +"," + String.valueOf(changeWonResult) +"," + "\n";
		
		fw.append(field); //���� ���̾� ����  
		
	
	}
}
