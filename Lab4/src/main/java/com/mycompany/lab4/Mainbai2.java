
package com.mycompany.lab4;


public class Mainbai2 {
     public static void main(String[] args) {
       
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        System.out.println("Nhập thông tin sản phẩm 1:");
        sp1.nhap();

        System.out.println("\nNhập thông tin sản phẩm 2:");
        sp2.nhap();
        
        System.out.println("\n--- Thông tin sản phẩm 1 ---");
        sp1.xuat();
     }
}
