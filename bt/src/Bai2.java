
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        double s = 0.0;
        for (int i = 1; i <= n; i ++) {
            s +=1.0/ i;
        }
        System.out.println("Tổng s = 1+ 1/2 +...: " + s);
    }
}
