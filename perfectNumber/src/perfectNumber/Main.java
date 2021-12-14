package perfectNumber;

public class Main {

	public static void main(String[] args) {
		int number=7;
		int add=0;
		int bolum;
		for(int i=1;i<number;i++) {
			bolum=number%i;
			if(bolum==0) {
				add=add+i;
				
			}
		}
		if(add==number) {
			System.out.println("bu sayı mikemmel sayıdır."+number);
		}
	}

}
