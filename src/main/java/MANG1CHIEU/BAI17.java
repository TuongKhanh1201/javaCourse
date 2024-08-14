/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MANG1CHIEU;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BAI17 {

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cho biet so phan tu");
        n = sc.nextInt();
        //cap phat so phan tu cho mang
        a = new int[n];
//Nhap giá trị cho mảng từ bàn phím
        nhapMang(a, sc);
//a.xuat mang ra man hinh
        System.out.println("===Mang a=====");
        xuatMang(a);
        double tb= trungBinh(a);
        System.out.print("\nGia tri trung binh cua mang: "+tb);
        double min=timMin(a);
        System.out.print("\nGia tri nho nhat: "+min);
        
        
    }
    //dinh nghia phuong thuc nhap mang

    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
//dinh nghia phuong thuc xuat mang

    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    public static double trungBinh(int[] a){
        double sum=0;
        for(double x: a){
            sum=sum+x;
        }
        return sum/a.length;
    }
    public static double timMin(int[] a){
        double min=a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] <min){
                min=a[i];
            }
        } return min;
    }
}
