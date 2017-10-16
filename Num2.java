public class Num2{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		if (args.length<1){
			System.err.println("not correct");
			System.exit(1);
		}
		int b,i=0,sum1=0,sum2=0;
		while(x>0){
			b = x%10;
			i = i+1;
			if (i<=3){
				sum2 = sum2+b;
			}
			else{
				sum1 = sum1+b;
			}
			x=x/10;
		}
		if (sum1==sum2){
			System.out.println("lucky");
		}
		else{
			System.out.println("not lucky");
		}

	}
}
