/*
Phuong trinh bac nhat
 */
package CAUTRUCRENHANH;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BAITAP1 {
    public static void main(String[] args) {
        double a,b;
        String kq="";
        Scanner sc= new Scanner(System.in);
        System.out.println("===Giai phuong trinh bac 1=====");
        // b1 nhap he so a , b
        System.out.println("Nhap he so a: ");
        a=sc.nextDouble();
        System.out.println("Nhap he so b: ");
        b=sc.nextDouble();
        // b2  giai va bien luan
        if(a==0){
            if(b==0){
                kq="Phuong trinh VSN";
            }
            else{
                kq="Phuong trinh vo nghiem";
            }
        }else{
            kq="Phuong trinh co nghiem x = "+(-b/a);
        }
            //b3 xuat ket qua
            System.out.println(kq);
    }
}
