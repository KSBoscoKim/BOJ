import java.util.Scanner;

public class Num1236 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        char[][] idx = new char[row][column];
        for (int i = 0; i < row; i++)
            idx[i] = scanner.next().toCharArray();

        boolean[] existRow = new boolean[row];
        boolean[] existCol = new boolean[column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (idx[r][c] == 'X') {
                    existRow[r] = true;
                    existCol[c] = true;
                }
            }
        }

        int rowNeedGuard = row;
        int colNeedGuard = column;

        for (int r = 0; r < row; r++)
            if (existRow[r]) rowNeedGuard--;

        for (int c = 0; c < column; c++)
            if (existCol[c]) colNeedGuard--;

        int needGuard = Math.max(rowNeedGuard, colNeedGuard);
        System.out.println(needGuard);


    }
}
