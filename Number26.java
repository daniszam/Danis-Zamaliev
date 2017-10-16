public class Number26{ 
	public static void main(String [] args){ 
		if (args.length<1){ 
			System.err.println("not correct, enter data"); 
			System.exit(1); 
		} 
		int n = Integer.parseInt(args[0]); 
		int[]p = new int[n+1]; 
		int[]p1 = new int[n+1]; 
		for (int i = 1; i<=n; i++){ 
			for (int j = 1; j<=n-i; j++){ 
				System.out.print(" "); 
			} 
			for (int j = 2; j<=i-1; j++){ 
				p1[j] = p[j]+p[j-1]; 
			} 
			p1[i] = 1; 
			for (int j = 1; j<=i; j++){ 
				System.out.print(p1[j]+" "); 
				p[j] = p1[j]; 
			} 
		System.out.println(""); 
		} 
	} 
}
