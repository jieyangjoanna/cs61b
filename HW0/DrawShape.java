public class DrawShape{
        public static void DrawTriangle(int N){
                for (int x=1;x<N+1; x=x+1){
                        for (int y=1;y<=x; y=y+1){
                                System.out.print("*");
                        }
                        System.out.println();
                }

        }
        public static void main(String[] args){
                DrawTriangle(10);
        }

}