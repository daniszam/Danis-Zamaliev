public class Num23{
	public static void main (String[] args){
		int a = Integer.parseInt(args[0]);
		if (a%2==0){
			System.err.println("numver is even");
			System.exit(1);
		}
		for (int i = 1; i<= a/2+1; i++){
			for (int j = 1; j<=a-i-2; j++){
				System.out.print(" ");
			}
			for (int j = 1; j<= i*2-1; j++){
				System.out.print("*");
			}
		System.out.println("");
		}
	}
}