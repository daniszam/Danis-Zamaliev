public class Num22_1{
	public static void main(String[] args){
		if (args.length<2){
				System.err.println("not correct");
				System.exit(1);
		}
		int a=Integer.parseInt(args[0]);
 		int b=Integer.parseInt(args[1]);
 		int i;
 		if (a==b){
				System.err.println(a);
				System.exit(0);
		}
		if (a>b){
 			i = a;
 		}
 		else{
 			i = b;
 		}
		while(a!=b){
			if (a>b){
				a = a-b;
			}
			else{
				b = b-a;
			}
		}
		System.out.println(a);
	}
}
