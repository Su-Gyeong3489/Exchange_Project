package moneyExchange;

import java.io.IOException;

public class ProcessingClass {	
	
	ExchangeType exType = new ExchangeType(); //클래스 ExchangeType 부르기(연결)     	
	OutputClass outClass = null;              //0과 같이 최초값 설정 

	ProcessingClass() {                        //생성자(class명과 동일) 
		outClass = new OutputClass();          //클래스 ProcesstingClass 부르기(연결)		
	}
			
	public double[] exchangeUSD(int won) {    //USD 계산 
		double ex_rate;	                                    //변수 환율 선언   
		ex_rate = ConstValueClass.EX_RATEUSD;			    //변수 환율을 ConstValueClass의 상수변수와 연결
		double exchangeResultUsd = won / ex_rate;          //변수 환전 결과 계산에 대한 정의
		int usd;                                            //변수 환전결과   
		usd = (int)exchangeResultUsd;
		int usdCurrent, usd100, usd50, usd20, usd10, usd5, usd2, usd1;
		double changeWon = (won - (usd * ex_rate));
		
		usdCurrent = (int) usd;
		usd100 = usdCurrent / 100;
		usdCurrent -= 100 * usd100;
		usd50 = usdCurrent / 50;
		usdCurrent -= 50 * usd50; 
		usd20 = usdCurrent / 20;
		usdCurrent -= 20 * usd20; 
		usd10 = usdCurrent / 10;		
		usdCurrent -= 10 * usd10; 
		usd5 = usdCurrent / 5;
		usdCurrent -= 5 * usd5;
		usd2 = usdCurrent / 2;  
		usdCurrent -= 2 * usd2;
		usd1 = usdCurrent / 1;
		usdCurrent -= usd1 * 1;
		                
		exType.changeWonResult = (int) (changeWon / 10) * 10;    //[main]거스름돈 계산(1원 자리 버림)
		exType.exchangeResult = usd;                              //[main]환전결과  
		
		outClass.print_exchangeUSD(usd, usd100, usd50, usd20, usd10, usd5, usd2, usd1); //[OutPutClass] 
		double[] cw = {exType.exchangeResult, exType.changeWonResult};  //[main #42]
		return cw;
		
	} 	
	                                    
	public double[] exchangeEUR(int won) {//USD 계산 
		double ex_rate;
		ex_rate = ConstValueClass.EX_RATEEUR;
		double exchangeResultEur;
		exchangeResultEur = won / ex_rate;
		int eur;
		eur = (int)exchangeResultEur;
		int eurCurrent, eur100, eur50, eur20, eur10, eur5, eur2, eur1; 
		double changeWon = (won - (eur * ex_rate));  
		
        eurCurrent = eur;
        eur100 = eurCurrent / 100;
        eurCurrent -= 100 * eur100;
        eur50 = eurCurrent / 50;
        eurCurrent -= 50 * eur50; 
        eur20 = eurCurrent / 20;
		eurCurrent -= 20 * eur20; 
		eur10 = eurCurrent / 10;		
		eurCurrent -= 10 * eur10; 
		eur5 = eurCurrent / 5;
		eurCurrent -= 5 * eur5;
		eur2 = eurCurrent / 2;
		eurCurrent -= 2 * eur2;
		eur1 = eurCurrent / 1;
		eurCurrent -= 1 * eur1;	
				              
		exType.changeWonResult = (int)(changeWon / 10) * 10;       //[main]거스름돈 계산(1원 자리 버림)
		exType.exchangeResult = eur;		                        //[main]환전결과 

		outClass.print_exchangeEUR(eur, eur100, eur50, eur20, eur10, eur5, eur2, eur1); //[OutPutClass(출력 클래스)]
		
		double[] cw = {exType.exchangeResult, exType.changeWonResult};  //[main #42]   
		return cw;
				
	}
		
	public double[] exchangeJPY(int won) { //엔 계산
		double ex_rate;                             //환율 
		ex_rate = ConstValueClass.EX_RATEJPY;
		double exchangeResultJpy;
		exchangeResultJpy = won / ex_rate;           //환전결과 계산  
	    int jpy; 
	    jpy = (int)exchangeResultJpy;
        int jpyCurrent, jpy5000, jpy1000, jpy500, jpy100, jpy50, jpy10, jpy5, jpy1; 
        double changeWon = (won - (jpy * ex_rate)); //거스름돈 계산          
			
	        jpyCurrent = jpy;
	        jpy5000 = jpyCurrent / 5000;
	        jpyCurrent -= 5000 * jpy5000;

			jpy1000 = jpyCurrent / 1000;
			jpyCurrent -= 1000 * jpy1000; 
			
	        jpy500 = jpyCurrent / 500;		
			jpyCurrent -= 500 * jpy500; 
		
			jpy100 = jpyCurrent / 100;
			jpyCurrent -= 100 * jpy100;

	        jpy50 = jpyCurrent / 50;		
			jpyCurrent -= 50 * jpy50; 

			jpy10 = jpyCurrent / 10;
			jpyCurrent -= 10 * jpy10;

	        jpy5 = jpyCurrent / 5;		
			jpyCurrent -= 5 * jpy5; 

			jpy1 = jpyCurrent / 1;
			jpyCurrent -= 1 * jpy1;
			        
			exType.changeWonResult = (int)(changeWon / 10) * 10;        //[main]거스름돈 계산(1원 자리 버림)  
			exType.exchangeResult = jpy;                                 //[main]환전결과      
			
			outClass.print_exchangeJPY(jpy, jpy5000, jpy1000, jpy500, jpy100, jpy50, jpy10, jpy5, jpy1); //[OutPutClass(출력 클래스)]						
			
			double[] cw = {exType.exchangeResult, exType.changeWonResult};    //[main #42]
			return cw;

	} 
	
	public void returnWon() {
		
		int won10000, won5000;
		int won1000, won500, won100, won50, won10;
		 
		won10000 = exType.changeWonResult / 10000;           //'환전결과'의 거스름돈 지폐 및 동전 수 
		won5000 = exType.changeWonResult / 5000; 
		won1000 = exType.changeWonResult / 1000; 
		won500 = exType.changeWonResult % 1000 / 500; 
		won100 = exType.changeWonResult % 500 / 100; 
		won50 = exType.changeWonResult % 100 / 50;
		won10 = exType.changeWonResult % 50 / 10; 
		
		int resultWon = exType.changeWonResult;             //[OutPutClass(출력 클래스)] 
		outClass.printWon(resultWon, won10000, won5000, won1000, won500, won100, won50, won10);  
	}

}

