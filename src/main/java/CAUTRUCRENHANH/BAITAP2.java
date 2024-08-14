/*
XEP LOAI HOC LUC
 */
package CAUTRUCRENHANH;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BAITAP2 {
    public static void main(String[] args) {
        double toan,van,anh;
        double dtb;
        String kq="";
        Scanner sc=new Scanner(System.in);
        System.out.println("===Xep loai hoc luc====");
        //b1 nhap diem toan van anh
        System.out.print("Nhap diem toan: ");
        toan=sc.nextDouble();
        System.out.print("Nhap diem van: ");
        van=sc.nextDouble();
        System.out.print("Nhap diem anh: ");
        anh=sc.nextDouble();
        
        // b2 tinh diem truung binh
        dtb=(toan+van+anh)/3;
        //b3 xep loai dua tren dtb
        if(dtb<4){
            kq="Yeu";
        } else if(dtb<6.5){
            kq="Trung binh";
        }else if(dtb<8){
            kq="Kha";
        }else{
            kq="Gioi";
        }
        //b4 xuat ket qua
        System.out.println("DTB:"+ dtb +"-Xep loai:"+kq);
    }
}
