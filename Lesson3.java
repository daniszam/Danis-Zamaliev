import java.util.Arrays;
public class Lesson3{
	public static void main (String[] args){
		int[] a = new int[]{1, 3, 4, 6, 8, 9};
		int[] b = new int[a.length];
		int j=a.length;
		for (int i=0; i<=j-1; i++){
			System.out.print(a[i]+" ");
		}
		System.arraycopy(a,0,b,1,5);
		for (int i=0; i<=j-1; i++){
			System.out.print(b[i]+" ");
		}
	}
}