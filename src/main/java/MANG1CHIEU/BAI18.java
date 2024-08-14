/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANG1CHIEU;


import java.util.Scanner;

/**
 *
 * @author Vinh
 */
public class BAI18 {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("mảng số nguyên có n phần tử (1≤n≤50)");
        n=sc.nextInt();
          a = new int[n];
           nhapMang(a, sc);
//a.xuat mang ra man hinh
        System.out.print("===Mang a=====");
        xuatMang(a);
        if(soNguyenTo(a)==true)
        System.out.print("\nCac so nguyen to");
        else
            System.out.print("\nko la so nguyen to");
    }
     public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
         public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
         public static boolean soNguyenTo(int[] a){

             int dem=0;
             for (int i = 1; i <=a.length; i++) {
                 if(a.length%i==0)
                     dem++;
             }
             if(dem==2)
                 return true;
             
        return false;
                 
             
         } 
}

