public class Numb3{
	public static void main(String[] args){
		if (args.length<2){
			System.err.println("not correct");
			System.exit(1);
   		}
      	int x = Integer.parseInt(args[0]);
   		if (x == 0){
   		System.err.println("not correct");
			System.exit(1);
		}
		double r = 0;
      	int k=Integer.parseInt(args[1]);//количество вложений
		for (int i = k; i >= 0 ; i-- ){
			r = 1/((x)+r);
		}
		System.out.println("S="+(r+1));
 	}
 }