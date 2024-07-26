import java.util.Scanner;

public class Num1919 {
    public static int[] alphaCnt(String s){
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++)
            cnt[s.charAt(i) - 'a']++;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int[] cnt1 = alphaCnt(str1);
        int[] cnt2 = alphaCnt(str2);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(cnt1[i] - cnt2[i]);
        }

        System.out.println(ans);
    }
}
