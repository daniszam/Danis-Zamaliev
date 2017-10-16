public class Num16{
	public static void main(String[] args){
		
		if (args.length<1){
				System.err.println("not correct");
				System.exit(1);
		} 
		int a=Integer.parseInt(args[0]);	
	  	int b;
	  	String m="";
	  	while(a>0){
			 b = a%2;  
	         m = m + b;  
	         a = a/2;
		}	         
	System.out.println(m);
	}
}