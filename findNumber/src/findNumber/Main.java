package findNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers=new int[] {1,2,4,5,7,9,8,6 };
		int find=6;
		boolean isThere= false;
		for(int i:numbers) {
			if(find==i) {
				isThere=true;
				break;
			}
		}
		if(isThere) {
			System.out.println("Dizinin içinde sayý mevcuttur");
		}
		else {
			System.out.println("dizinin içinde aranan sayý yoktur");
		}

	}

}
