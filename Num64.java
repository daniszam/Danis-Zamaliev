public class Num64{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int s=0;
		if (args.length<1){
			System.err.println("not correct");
			System.exit(1);
		}
		for (int i=1; i<=a; i++){
			s = s + calcRecipient(i);
		}
		System.out.println(s);
	}
	public static int calcRecipient(int i){
			if (i==1){
				return 1;
			}
			else{
				return calcRecipient(i-1)*calcKind(i-1);	
			}
	}
	public static int calcKind(int i){
		if (i==1){
			return 10;
		}
		else{
			if (i>5){
				if (i%2==0){
					return 2;
				}
				else{
					return 3;
				}
			}
			else{
				if (i%2==0){
					return calcKind(i-1)+1;
				}
				else{
					return calcKind(i-1)-2;
				}
			}
		}
	}
}