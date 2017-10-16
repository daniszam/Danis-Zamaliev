public class Num22{
	public static void main(String[] args){
		if (args.length<2){
				System.err.println("not correct");
				System.exit(1);
		}
		int a=Integer.parseInt(args[0]);
 		int b=Integer.parseInt(args[1]);
 		int i;
 		if (a>b){
 			i = a;
 		}
 		else{
 			i = b;
 		}
		for (i = i ;i<=(a*b); i--){
			if((a%i==0)&&(b%i==0)){
				System.out.println("nod="+i);
				break;
			}
		}
	}
}