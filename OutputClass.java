package moneyExchange;

public class OutputClass {  //Console 출력 클래스 
	
	public void printWon(int resultWon, int won10000,
            int won5000, int won1000, int won500, int won100, int won50, 
            int won10) {
	                     
		System.out.printf("[원화 거스름돈] : %d 원\n", resultWon);
		System.out.printf("-10000원 : " + won10000 + "장\t");
		System.out.printf("5000원 : " + won5000 + "장\t");
		System.out.printf("1000원 : " + won10000 + "장\t");
		System.out.printf("500원 : " + won500 + "개\t");
		System.out.printf("100원 : " + won100 + "개\t");
		System.out.printf("50원 : " + won50 + "개\t");
		System.out.printf("10원 : " + won10 + "개\n\n");	    

	}
	
	public void print_exchangeUSD(double usd, int usd100, int usd50, int usd20, 
            						int usd10, int usd5, int usd2, int usd1) {
		System.out.printf("[달러로 환전 결과]\n");
		System.out.printf("-달러 지급 : " + usd + "달러\n");		
		System.out.printf("-USD 100 : " + usd100 + " 장\t");
		System.out.printf("USD 50 : " + usd50 + " 장\t");
		System.out.printf("USD 20 : " + usd20 + " 장\t");
		System.out.printf("USD 10 : " + usd10 + " 장\t");
		System.out.printf("USD 5 : " + usd5 + " 장\t");
		System.out.printf("USD 2 : " + usd2 + " 장\t");
		System.out.printf("USD 1 : " + usd1 + " 장\n\n");
	}
	
	public void print_exchangeEUR(int eur, int eur100, int eur50, int eur20, 
									int eur10, int eur5, int eur2, int eur1) {
		System.out.printf("[유로로 환전 결과]\n");
		System.out.printf("-유로 지급 : " + eur + "유로\n");
		System.out.printf("-EUR 100 : " + eur100 + " 장\t");	
		System.out.printf("EUR 50 : " + eur50 + " 장\t");		
		System.out.printf("EUR 20 : " + eur20 + " 장\t");    
		System.out.printf("EUR 10 : " + eur10 + " 장\t");
		System.out.printf("EUR 5 : " + eur5 + " 장\t");
		System.out.printf("EUR 2 : " + eur2 + " 장\t");
		System.out.printf("EUR 1 : " + eur1 + " 장\n\n");
	}

	public void print_exchangeJPY(double jpy, int jpy5000, int jpy1000, int jpy500,
                                  int jpy100, int jpy50, int jpy10, int jpy5, int jpy1) {
            
		System.out.printf("[엔화로 환전 결과]\n");
		System.out.printf("-엔화 지급 : " + jpy + "엔\n");
		System.out.printf("-JPY 5000 : " + jpy5000 + " 장\t");
		System.out.printf("JPY 1000 : " + jpy1000 + " 장\t");
		System.out.printf("JPY 500 : " + jpy500 + " 장\t");
		System.out.printf("JPY 100 : " + jpy100 + " 장\t");
		System.out.printf("JPY 50 : " + jpy50 + " 장\t");
		System.out.printf("JPY 10 : " + jpy10 + " 장\t");
		System.out.printf("JPY 5 : " + jpy5 + " 장\t");
		System.out.printf("JPY 1 : " + jpy1 + " 장\n\n");							
	} 

}
