public class Number24{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		if (a<0){
			System.err.println("diametr can't 0");
			System.exit(1);
		}
		for (int i=1; i<=a; i++){
			if ((i==1)|(i==a)){
				if (a%2==0){
					for (int j=1; j<=a/2; j++){
					System.out.print(" ");
				}
				else{
					for (int j=1; j<=(a/2)-1; j++){
						System.out.println(" ");
					}
				}
			}
			else{
				if (a%2==0){
					for (int j=1; j<a/i+2; j++){
						System.out.print("*"+" ");
					}
				}
				if (a%2!=0){
					for (int j=1; j<a/2+1; j++){
						System.out.print("*"+" ");
					}
				}
			}
			else{
				if (i<=a/2){
					for (int j=1; j<=i/2; j++){ //i/2 i a-количество элементоа
						System.out.print(" ");
					}
					for (int j=1; j<=i/2; j++){
						System.out.print("**");
					}
				}
			}
		System.out.println("");
		}
	}
}		
       
		