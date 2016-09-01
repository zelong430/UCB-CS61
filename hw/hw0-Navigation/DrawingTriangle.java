public class DrawingTriangle{
    public static void main(String[] args){
            DrawingTriangle(10);
        }
   

    public static void DrawingTriangle(int N){
    
        int num_line = N;
        int num_star = 0;
        while(num_line >0){
            while(num_line > 0){
            String cur_line = "*";
            for (int i = 0; i < num_star; i++){
                cur_line = cur_line + "*";
            }
            System.out.println(cur_line);
            num_star ++;
            num_line --;
            }
        }
        return;
    }
}
