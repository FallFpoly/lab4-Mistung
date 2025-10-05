
package com.mycompany.lab4;

import java.util.Scanner;
  
class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();

        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.printf("Đơn giá: %.2f\n", donGia);
        System.out.printf("Giảm giá: %.2f\n", giamGia);
        System.out.printf("Thuế nhập khẩu: %.2f\n", getThueNhapKhau());
    }
}
public class bai1 {
    public static void main(String[] args) {
        SanPham sp = new SanPham();  
        sp.nhap();                   
        System.out.println("\n--- Thông tin sản phẩm ---");
        sp.xuat();                 
    }
}