package moneyExchange;

public class ExchangeType {      //클래스 CsvOutput에 필요한 변수 정리 

	static int  won;             //[InputFromConsoleClass]환전할 금액  
	
	static int type;             //[InputFromConsoleClass]환전 선택 타입
	static String ExchType;      //[CsvOutput]환전대상
	
	static int changeWonResult; //[ProcessingClass에서 정의]지급될 금액(1원자리 버림 금액) 
	static int exchangeResult;  //[ProcessingClass애서 정의]환전된 금액(달러, 유로, 엔) 
	static double[] cw;        //[ProcessingClass에서 정의]파일 작성을 위해 거스름돈과 지급금액을 받아줌
	
}
