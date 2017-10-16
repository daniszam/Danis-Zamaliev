public class CompareTo{
	public static void main (String[] args){
		String a = new String ("Izrael");
		String b = new String ("sisadmin");
		int n,k=0;
		if (a.equals(b)){
			System.out.print("0");
		}
		else{
			if (a.length()<b.length()){
				n = a.length();
			}
			else{
				n = b.length();
			}
			for (int i = 0; i<=n-1; i++){
				if (a.charAt (i) - b.charAt(i)!=0){
					System.out.println(a.charAt (i) - b.charAt(i));
					break;
				}
			}
		}
		int l = a.compareTo(b);
		System.out.println(l);
	}
}