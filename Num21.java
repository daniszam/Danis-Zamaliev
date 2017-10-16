public class Num21{
	public static void main(String[] args){
		if (args.length<2){
				System.err.println("not correct");
				System.exit(1);
		}
		int i;
		int a=Integer.parseInt(args[0]);
 		int b=Integer.parseInt(args[1]);
 		if (a>b){
 			i=a;
 		}
 		else{
 			i=b;
 		}
 		for (i=i; i<=a*b; i++){
			if ((i%a==0)&&(i%b==0)){
				System.out.println(i);
				break;
			}
		}
	}
}