package moneyExchange;

public class OutputClass {  //Console ��� Ŭ���� 
	
	public void printWon(int resultWon, int won10000,
            int won5000, int won1000, int won500, int won100, int won50, 
            int won10) {
	                     
		System.out.printf("[��ȭ �Ž�����] : %d ��\n", resultWon);
		System.out.printf("-10000�� : " + won10000 + "��\t");
		System.out.printf("5000�� : " + won5000 + "��\t");
		System.out.printf("1000�� : " + won10000 + "��\t");
		System.out.printf("500�� : " + won500 + "��\t");
		System.out.printf("100�� : " + won100 + "��\t");
		System.out.printf("50�� : " + won50 + "��\t");
		System.out.printf("10�� : " + won10 + "��\n\n");	    

	}
	
	public void print_exchangeUSD(double usd, int usd100, int usd50, int usd20, 
            						int usd10, int usd5, int usd2, int usd1) {
		System.out.printf("[�޷��� ȯ�� ���]\n");
		System.out.printf("-�޷� ���� : " + usd + "�޷�\n");		
		System.out.printf("-USD 100 : " + usd100 + " ��\t");
		System.out.printf("USD 50 : " + usd50 + " ��\t");
		System.out.printf("USD 20 : " + usd20 + " ��\t");
		System.out.printf("USD 10 : " + usd10 + " ��\t");
		System.out.printf("USD 5 : " + usd5 + " ��\t");
		System.out.printf("USD 2 : " + usd2 + " ��\t");
		System.out.printf("USD 1 : " + usd1 + " ��\n\n");
	}
	
	public void print_exchangeEUR(int eur, int eur100, int eur50, int eur20, 
									int eur10, int eur5, int eur2, int eur1) {
		System.out.printf("[���η� ȯ�� ���]\n");
		System.out.printf("-���� ���� : " + eur + "����\n");
		System.out.printf("-EUR 100 : " + eur100 + " ��\t");	
		System.out.printf("EUR 50 : " + eur50 + " ��\t");		
		System.out.printf("EUR 20 : " + eur20 + " ��\t");    
		System.out.printf("EUR 10 : " + eur10 + " ��\t");
		System.out.printf("EUR 5 : " + eur5 + " ��\t");
		System.out.printf("EUR 2 : " + eur2 + " ��\t");
		System.out.printf("EUR 1 : " + eur1 + " ��\n\n");
	}

	public void print_exchangeJPY(double jpy, int jpy5000, int jpy1000, int jpy500,
                                  int jpy100, int jpy50, int jpy10, int jpy5, int jpy1) {
            
		System.out.printf("[��ȭ�� ȯ�� ���]\n");
		System.out.printf("-��ȭ ���� : " + jpy + "��\n");
		System.out.printf("-JPY 5000 : " + jpy5000 + " ��\t");
		System.out.printf("JPY 1000 : " + jpy1000 + " ��\t");
		System.out.printf("JPY 500 : " + jpy500 + " ��\t");
		System.out.printf("JPY 100 : " + jpy100 + " ��\t");
		System.out.printf("JPY 50 : " + jpy50 + " ��\t");
		System.out.printf("JPY 10 : " + jpy10 + " ��\t");
		System.out.printf("JPY 5 : " + jpy5 + " ��\t");
		System.out.printf("JPY 1 : " + jpy1 + " ��\n\n");							
	} 

}
