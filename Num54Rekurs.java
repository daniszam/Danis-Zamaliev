public class Num54Rekurs{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		System.out.println(calcNum(a));
	}
	public static int calcNum(int a){
		if (a<=2){
			return 1;
		}
		else{
			return calcNum(a-1)+calcNum(a-2);
		}
	}
}