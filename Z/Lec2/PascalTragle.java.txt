package code;

public class PascalTrangle {
	public static void starPrint(int numberOfOrder) {
		int row=0;
		int star=1;
		while(row<numberOfOrder) {
			int col=0;
			while(col<star) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
			star++;
		}
	}
	
	public static void pascalTrangle(int numberOfOrder) {
		int row=0;
		int star=1;
		while(row<numberOfOrder) {
			int col=0;
			int val=1;
			while(col<star) {
				System.out.print(val+" ");
				val=(((row-col)*val)/(col+1));
				col++;
			}
			System.out.println();
			row++;
			star++;
		}
	}
	
	public static void main(String[] args) {
		int numberOfOrder=6;
		starPrint(numberOfOrder);
		pascalTrangle(numberOfOrder);
	}

}
