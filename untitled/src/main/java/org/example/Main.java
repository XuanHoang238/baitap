package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        String maSV = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        double diemCC = nhapDiem(sc, "Diem chuyen can");
        double diemGK = nhapDiem(sc, "Diem giua ky");
        double diemCK = nhapDiem(sc, "Diem cuoi ky");

        double diemTK = diemCC * 0.10 + diemGK * 0.30 + diemCK * 0.60;

        String xepLoai;
        if (diemTK >= 8.5) {
            xepLoai = "A";
        } else if (diemTK >= 7.0) {
            xepLoai = "B";
        } else if (diemTK >= 5.5) {
            xepLoai = "C";
        } else if (diemTK >= 4.0) {
            xepLoai = "D";
        } else {
            xepLoai = "F";
        }

        System.out.println("\nKet qua:");
        System.out.printf("%s - %s - %.2f - %s\n", maSV, hoTen, diemTK, xepLoai);
    }

    public static double nhapDiem(Scanner sc, String tenDiem) {
        double diem;
        while (true) {
            System.out.print("Nhap diem " + tenDiem + ": ");
            diem = sc.nextDouble();
            if (diem >= 0 && diem <= 10) {
                return diem;
            }
            System.out.println("Diem " + diem + " khong hop le vui long nhap lai .");
        }
    }
}