public class Num26{
	public static void main(String[] args){
		if (args.length<1){
			System.err.println("not correct");
			System.exit(1);
		}
		int a = Integer.parseInt(args[0]);
		if (a%2==0){
			System.err.println("numbver is even");
			System.exit(1);
		}
		int C,n=1;
		int j,z;
		int p=1,p1=1;
		for (int i = 0; i<=a; i++){
			for (j=1; j<=a-i;j++){
					System.out.print(" ");
			}
			if (i==0){
				System.out.print("1");
			}
			else{
				p = p*i;
				for ( j = 0; j<=i; j++){
					if ((j==0&&i!=0)|(j==i)){
						System.out.print("1"+"     ");
					}
					else{
						for (z = 1;z<=(i-j); z++){
							n=n*z;
						}
						p=p*j;
						p1 = p1*j;
						C=p/(p1*n);
						n=1;
						System.out.print(C+" ");

					}
				}
				p1=1;
				
			}
				
		System.out.println("");
	    }
	}
}


