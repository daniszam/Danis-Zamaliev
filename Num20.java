public class Num20{
	public static void main(String[] args){
		if (args.length<1){
				System.err.println("not correct");
				System.exit(1);
		} 
		int a=Integer.parseInt(args[0]);
		for (int i=1; i<=a; i++){
			if (a%i==0){
				System.out.println(i);
			}
		}
	}
}