public class Num17{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]); 
		int p = Integer.parseInt(args[1]);
		if (p<1&&p>11){
			System.err.println("not correct");
			System.exit(1);
		}
		int b,s=0;
		String q="";
		while (a>0){
			b = a%p;
			s = s+b;
			q = b+q;
			a = a/p;
		}
		System.out.println("S="+s+" "+"q="+q);
	}
}