/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CAUTRUCVONGLAP;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BAITAP8 {
    public static void main(String[] args) {
     int n;
     int s;
     Scanner sc=new Scanner(System.in);
     System.out.println("==Tinh Tong Cac So :1+2+3+.. N====");
     //b1
     System.out.print("Nhap gia tri n:");
     n=sc.nextInt();
     // b2 Tinh tong cac day so
     s=0;
     for(int i=1;i<=n;i++){
         s=s+i;
     }
     //b3 xuat kq
        System.out.println("Tong cac gia tri: " +s);
    }
}
