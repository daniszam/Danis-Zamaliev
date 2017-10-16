public class Num30{
	public static void main(String[] args){
		String a = args[0];
		int z=0;
		int k=a.length();
		for ( int i=0; i<k; i++){
			for (int j=k-1; j>=0; j--){
				if (a.charAt(i)==a.charAt(j)){
					k = k-1;
					break;
				}
				else{
					z=1;
				}
			}
		}
		if (z==1){
			System.out.println("строка не является палендромом");
		}
		else{
			System.out.println("строка является палендромом");
		}
	}
}