import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
 
    private void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] A = new String[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.next();
        }
         
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isSimilarWord(A[0], A[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
 
    private boolean isSimilarWord(String word1, String word2) {
        int total = 26;
        int[] count = new int[total];
 
        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i) - 'A']++;
        }
         
        for (int i = 0; i < word2.length(); i++) {
            count[word2.charAt(i) - 'A']--;
        }
         
        int pCnt = 0;
        int mCnt = 0;
        for (int i = 0; i < total; i++) {
            if (count[i] > 0) pCnt += count[i];
            if (count[i] < 0) mCnt += count[i];
        }
         
        if (0 <= pCnt && pCnt <= 1 && -1 <= mCnt && mCnt <= 0) return true;
         
        return false;
    }
}