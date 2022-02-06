package algorithms;

public class Main {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int carpim;
		int left;
		int right;
		for(int i=0; i<=arr.length-1;i++) {
			carpim=1;
			left=1;
			 right=1;
			if(i>0) {
				for(int j= i-1; j>=0; j--) {
					left= left*arr[j];
					
				}
				for(int k=i+1; k<=arr.length-1; k++) {
					right= right*arr[k];
				}
				carpim=right*left;
				System.out.println(carpim);
			
			}
			else if(i==0) {
				for(int l=1;l<=arr.length-1;l++) {
					carpim=carpim*arr[l];
					
					
				}
				System.out.println(carpim);
				
				
			}
			
		}
		

	}

}
