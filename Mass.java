public class Mass{
	public static void main(String[] args){
		
		if (args.length<3){
				System.err.println("not correct");
				System.exit(1);
		} 
		int b = args.length;
		int[] sides = new int[b];
		int P=0;
		for (int i = 0; i<b; i++){
			sides[i] = Integer.parseInt(args[i]);
			System.out.print(sides[i]+",");
			P=P+sides[i];
		}
		System.out.println("P="+P);
	}
}
