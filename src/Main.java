import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] newStr = str.toCharArray();
        for (int i=0; i<str.length(); i++){
            if(newStr[i]>=65 && newStr[i]<=90){
                newStr[i] += 32;
            }else{
                newStr[i] -= 32;
            }
        }
        System.out.println(newStr);

    }
}
