
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 2; i <= n; i += 2) {
            s += i;
        }
        System.out.println("Tổng các số chẵn: " + s);
    }

}
