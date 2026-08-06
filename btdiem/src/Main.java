import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cc;
        double gk;
        double ck;
        double tk;
        boolean isLegal;
        System.out.print("Nhap diem chuyen can : ");
        cc = sc.nextDouble();
        System.out.print("Nhap diem giua ky : ");
        gk = sc.nextDouble();
        System.out.print("Nhap diem cuoi ky : ");
        ck = sc.nextDouble();
 tk = cc * 0.1 + gk * 0.3 + ck * 0.6;

        System.out.printf("Diem cuoi ky la : %.2f\n " , tk);
 if(ck >= 8.0 ){
     System.out.print("b la hoc sinh gioi");
 } else if (ck >= 6.5) {
     System.out.print(" b la hoc sinh kha ");
 } else if (ck >=4.5 ) {
     System.out.print("b la hoc sinh tb ");

 } else{
     System.out.print("hoc lai");
        }

        sc.close();
    }
}