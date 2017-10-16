public class Num29{
	public static void main(String[] args){
		String Text1 = args[0];
		String Text2 = args[1];
		int l = 0, index=0,n,m,k=0,z = 0;
	 	if (Text1.length()<Text2.length()){
	 		n = Text1.length();
	 		m = Text2.length();
	 	}
	 	else{
	 		n = Text2.length();
	 		m = Text1.length();
	 	}
	 	for (int i=0; i<n; i++){
	 		for ( int j=k; j<m; j++){
		 		if (Text2.charAt(i) == Text1.charAt(j)){
		 			l = l+1;
		 			if (l == 1){
		 				index = j;
		 			}
		 			k=j+1;
		 			break;
		 		}
		 		else{
		 			if (l!=0){
		 			l = 0;
		 			i = 0;
		 			z = z+1;
		 			break;
		 			}
		 		}
		 	}
		}
	 	if (z!=0){
	 		index = index-1;
	 	}
	 	System.out.println("index="+index);
	 }
	
}