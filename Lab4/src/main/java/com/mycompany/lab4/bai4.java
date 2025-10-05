
package com.mycompany.lab4;

public class bai4 {
    
public class SanPham {
    
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    public String getTenSp() {
        return this.tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            System.out.println("Đơn giá phải lớn hơn hoặc bằng 0");
        }
    }

    public double getGiamGia() {
        return this.giamGia;
    }

    public void setGiamGia(double giamGia) {
        if (giamGia >= 0 && giamGia <= donGia) {
            this.giamGia = giamGia;
        } else {
            System.out.println("Giảm giá phải lớn hơn hoặc bằng 0 và không vượt quá đơn giá");
        }
    }

    private double getThueNhapKhau() {
        return this.donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + this.tenSp);
        System.out.printf("Đơn giá: %.2f\n", this.donGia);
        System.out.printf("Giảm giá: %.2f\n", this.giamGia);
        System.out.printf("Thuế nhập khẩu: %.2f\n", getThueNhapKhau());
        System.out.println("----------------------------");
    }
}
}
