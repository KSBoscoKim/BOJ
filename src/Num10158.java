import java.util.Scanner;

public class Num10158 {
    public static int location(int loc, int idx, int time) {
        int fakeIdx = (idx + time) % (2*loc);
        int realIdx = 0;
        if (fakeIdx > loc) {
            realIdx = (2*loc) - fakeIdx;
        } else {
            realIdx = fakeIdx;
        }
        return realIdx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.nextLine();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();
        int time = scanner.nextInt();
        int x = location(w,p,time);
        int y = location(h,q,time);

        System.out.println(x + " " + y);


    }
}
