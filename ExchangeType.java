package moneyExchange;

public class ExchangeType {      //Ŭ���� CsvOutput�� �ʿ��� ���� ���� 

	static int  won;             //[InputFromConsoleClass]ȯ���� �ݾ�  
	
	static int type;             //[InputFromConsoleClass]ȯ�� ���� Ÿ��
	static String ExchType;      //[CsvOutput]ȯ�����
	
	static int changeWonResult; //[ProcessingClass���� ����]���޵� �ݾ�(1���ڸ� ���� �ݾ�) 
	static int exchangeResult;  //[ProcessingClass�ּ� ����]ȯ���� �ݾ�(�޷�, ����, ��) 
	static double[] cw;        //[ProcessingClass���� ����]���� �ۼ��� ���� �Ž������� ���ޱݾ��� �޾���
	
}
