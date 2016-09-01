public class DrawingTriangle{
    public static void main(String[] args){
        int num_line = 5;
        int num_star = 0;
        while(num_line > 0){
            String cur_line = "*";
            for (int i = 0; i< num_star; i++){
                cur_line = cur_line + "*";
            }
            System.out.println(cur_line);
            num_star += 1;
            num_line --;
        }
    }
}
