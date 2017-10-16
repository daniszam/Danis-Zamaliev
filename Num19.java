public class Num19{
	public static void main(String[] args){
		if (args.length<1){
				System.err.println("not correct");
				System.exit(1);
		} 
		int a=Integer.parseInt(args[0]);	
	  	int b;
	  	int m = 0;
	  	int max = 0;
	  	while(a>0){
			 b = a%2;  
	         if (b == 0){
	         	m=0;
	         }
	         else{
	         	m=m+1;
	         	if (m>max){
	         		max=m;
	         	}
	         }
	         a=a/2;
	    }	         
	 	System.out.println("max="+max);
	}
}