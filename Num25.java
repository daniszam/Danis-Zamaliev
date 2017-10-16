public class Num25{
	public static void main(String[] args){
		int[] a = new int[100];
		int p=100;
		int i;
		int k;
		for (i = 0; i<=99; i++){
			a[i]=(int)(Math.random()*p);
		} 
		for (i=0; i<=99; i++){
			for (int j=0; j<=99; j++){
				if (a[i]<a[j]){
					k=a[j];
                    a[j]=a[i];
                    a[i]=k;				
                }
			}
		}
		for (i = 0; i<=99; i++){
			System.out.print(a[i]+" ");
		}
	}
}