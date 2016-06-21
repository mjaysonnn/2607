import java.util.Scanner;
 
public class Main {
 
    static int Answer = 0;
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String basic = sc.next();
         
        for (int i = 0; i < N-1; i++) {
            String comStr = sc.next();
            char[] compareStr = comStr.toCharArray();
             
            if(basic.equals(comStr)){
                Answer++;
                continue;
            }
            else{
                int flagCount = 0;
                for (int j = 0; j < compareStr.length; j++) {
                    if(basic.indexOf(compareStr[j]) == -1){
                        flagCount++;
                    }
                    if (flagCount == 2)
                        break;
                }
                 
                if ((flagCount == 0) || (flagCount==1 && compareStr.length > 1)){
                    Answer++;
                }
            }
        }
        System.out.println(Answer);
    }
}