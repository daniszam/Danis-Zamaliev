public class Numb0{ 
 	public static void main(String[] args) {
		if (args.length==0){
			System.err.println("not correct");
			System.exit(1);
		}
		int n = Integer.parseInt(args[0]);
		if (n<1){
			System.err.println("not correct");
			System.exit(1);
		}
		int q2=2;
		int q=1;
		double w=0.5;
		for (int i=2;i<=n;i++){
			q = q*(i-1);
			q2 = q2*(2*i-1)*2*i;
			w = w+((double)q)*q/q2;
		}	
	    System.out.println("w="+w);
	}

}