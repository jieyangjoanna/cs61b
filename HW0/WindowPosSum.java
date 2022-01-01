public class PosSum{
        public static int[] WindowPosSum(int[] a, int n){
                //int[] b = a; array b points to the address of a, which means array b is the same as array a
				int[] b = new int[a.length];
				java.util.Arrays.fill(b, 0);
                //java.util.Arrays.fill(b, 0);
                for(int i=0; i<a.length; i++){
                        if (a[i] <=0){
                                b[i]=a[i];
                                continue;
                        }
                        b[i]=0;
                        for (int j=i; j-i<=n;j++){
                                b[i] += a[j];
                                System.out.println("i is " + i);
                                System.out.println("j is " + j);
                                System.out.println("a[i] is " + a[i]);
                                System.out.println("b[i] is "+ b[i]);
                                System.out.println();
                                if (j+1>=a.length)
                                        break;
                        }

                //      else b[i] = a[i];
                }
                return b;
        }
        public static void main(String[] args){
                int[] a = {1,2,-3,4,5,4};
                System.out.println(java.util.Arrays.toString(a));
                int n=3;
                int[] newArray = WindowPosSum(a, n);
                System.out.println(java.util.Arrays.toString(newArray));

        }
}