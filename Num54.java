public class Num54{
	public static void main (String[] args){
		int a = Integer.parseInt(args[0]);
		int z=1;
		int n=1;
		int t;
		for (int i=2; i<=a; i++){
			t = z;
			z = z+n;
			n = t;
			if (i == a){
				System.out.println(n);
			}
		}
	}
}