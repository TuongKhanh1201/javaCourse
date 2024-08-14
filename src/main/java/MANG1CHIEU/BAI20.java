/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANG1CHIEU;

import static MANG1CHIEU.BAI18.soNguyenTo;
import java.util.Scanner;

/**
 *
 * @author Vinh
 */
public class BAI20 {

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
        System.out.println("Sau tim vi tri");
    }  public static void nhapMang(int[] a, Scanner sc) {
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
         public static int timViTri(int[] a,int x){
             for (int i = 0; i < a.length; i++) {
                 if(a[i] == x){
                     return i;
                 }
             }
             return -1;
         }
         public static boolean kiemTraTang(int[] a){
             for (int i = 1; i < a.length; i++) {
                 if(a[i]< a[i-1]){
                     return false;
                 }
             }
             return true;
         }
}
