public class Number1{
	public static void main(String[] args){
		float x = Float.parseFloat(args[0]);
		float y = Float.parseFloat(args[1]);
		if (args.length<2){
			System.err.println("no x or y");
			System.exit(1);
		}
		if (x==0){
			System.err.println("x muss ><0");
			System.exit(2);
		}
		double z = Math.sin(x);
		if (y==(double)z/x){
			System.out.println("correct function");
		}
		else{
			System.out.println("not correct function");
		}
	}
}