public class Circle24 {
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        double r=(double)n/2;
        for (int i = (int)-r; i <=(int) r; i++) {
            for (int j = (int)-r; j <=(int) r; j++) {
                if (i*i + j*j <= r*r){
                     System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}