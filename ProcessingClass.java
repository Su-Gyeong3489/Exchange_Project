package moneyExchange;

import java.io.IOException;

public class ProcessingClass {	
	
	ExchangeType exType = new ExchangeType(); //Ŭ���� ExchangeType �θ���(����)     	
	OutputClass outClass = null;              //0�� ���� ���ʰ� ���� 

	ProcessingClass() {                        //������(class��� ����) 
		outClass = new OutputClass();          //Ŭ���� ProcesstingClass �θ���(����)		
	}
			
	public double[] exchangeUSD(int won) {    //USD ��� 
		double ex_rate;	                                    //���� ȯ�� ����   
		ex_rate = ConstValueClass.EX_RATEUSD;			    //���� ȯ���� ConstValueClass�� ��������� ����
		double exchangeResultUsd = won / ex_rate;          //���� ȯ�� ��� ��꿡 ���� ����
		int usd;                                            //���� ȯ�����   
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
		                
		exType.changeWonResult = (int) (changeWon / 10) * 10;    //[main]�Ž����� ���(1�� �ڸ� ����)
		exType.exchangeResult = usd;                              //[main]ȯ�����  
		
		outClass.print_exchangeUSD(usd, usd100, usd50, usd20, usd10, usd5, usd2, usd1); //[OutPutClass] 
		double[] cw = {exType.exchangeResult, exType.changeWonResult};  //[main #42]
		return cw;
		
	} 	
	                                    
	public double[] exchangeEUR(int won) {//USD ��� 
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
				              
		exType.changeWonResult = (int)(changeWon / 10) * 10;       //[main]�Ž����� ���(1�� �ڸ� ����)
		exType.exchangeResult = eur;		                        //[main]ȯ����� 

		outClass.print_exchangeEUR(eur, eur100, eur50, eur20, eur10, eur5, eur2, eur1); //[OutPutClass(��� Ŭ����)]
		
		double[] cw = {exType.exchangeResult, exType.changeWonResult};  //[main #42]   
		return cw;
				
	}
		
	public double[] exchangeJPY(int won) { //�� ���
		double ex_rate;                             //ȯ�� 
		ex_rate = ConstValueClass.EX_RATEJPY;
		double exchangeResultJpy;
		exchangeResultJpy = won / ex_rate;           //ȯ����� ���  
	    int jpy; 
	    jpy = (int)exchangeResultJpy;
        int jpyCurrent, jpy5000, jpy1000, jpy500, jpy100, jpy50, jpy10, jpy5, jpy1; 
        double changeWon = (won - (jpy * ex_rate)); //�Ž����� ���          
			
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
			        
			exType.changeWonResult = (int)(changeWon / 10) * 10;        //[main]�Ž����� ���(1�� �ڸ� ����)  
			exType.exchangeResult = jpy;                                 //[main]ȯ�����      
			
			outClass.print_exchangeJPY(jpy, jpy5000, jpy1000, jpy500, jpy100, jpy50, jpy10, jpy5, jpy1); //[OutPutClass(��� Ŭ����)]						
			
			double[] cw = {exType.exchangeResult, exType.changeWonResult};    //[main #42]
			return cw;

	} 
	
	public void returnWon() {
		
		int won10000, won5000;
		int won1000, won500, won100, won50, won10;
		 
		won10000 = exType.changeWonResult / 10000;           //'ȯ�����'�� �Ž����� ���� �� ���� �� 
		won5000 = exType.changeWonResult / 5000; 
		won1000 = exType.changeWonResult / 1000; 
		won500 = exType.changeWonResult % 1000 / 500; 
		won100 = exType.changeWonResult % 500 / 100; 
		won50 = exType.changeWonResult % 100 / 50;
		won10 = exType.changeWonResult % 50 / 10; 
		
		int resultWon = exType.changeWonResult;             //[OutPutClass(��� Ŭ����)] 
		outClass.printWon(resultWon, won10000, won5000, won1000, won500, won100, won50, won10);  
	}

}

