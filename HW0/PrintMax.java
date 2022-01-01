public class PrintMax{
        /* Returns the max value from m. */
        public static int max(int[] m){
                int num = m.length;
				System.out.println("array length is " + num);
                int maxArray = m[0];
                for(int i=1;i< num; i=i+1){
                        if(m[i]>maxArray){
                        maxArray = m[i];
                        }
                }

                return maxArray;
        }
        public static void main(String[] args){
                int[] numbers=new int[]{9, 2, 15, 2, 22, 10, 6};
				/* PrintMax object = new PrintMax(); */
                System.out.println("Max value of array is" + max(numbers));
        }
}