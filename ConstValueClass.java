package moneyExchange;

public class ConstValueClass {
        //환전 관련 상수를 final static으로 함으로써 
	    //수정과 타 클래스에서의 이용을 용이하게 한다 
		final static int EX_TYPE_EXIT = 0;     //종료 
		final static int EX_TYPE_USD = 1;
		final static int EX_TYPE_EUR = 2;
		final static int EX_TYPE_JPY = 3;
		final static double EX_RATEUSD = 1133.4;
		final static double EX_RATEEUR = 1327.59;
		final static double EX_RATEJPY = 10.2;
	}


