/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MANG1CHIEU;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BAI19 {

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        n = docSoPhanTu(sc);
        //cap phat so phan tu cho mang
        a = new int[n];
//a.xuat mang ra man hinh
        phatSinhMang(a);
        System.out.print("\nMang duoc phat sinh:");
        xuatMang(a);
        sapXepMang(a);
        System.out.print("\nMang sau khi sap xep tang: ");
        xuatMang(a);
        
        System.out.print("\nCac phan tu la uoc so cua x");  
 

    }

    public static void sapXepMang(int[] a) {
        Arrays.sort(a);
    }
//dinh nghia phuong thuc xuat mang

    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    public static void phatSinhMang(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(101);

        }
    }
    public static int docSoPhanTu(Scanner sc){
        int n=0;
        do{
            System.out.println("Cho biet so phan tu mang (1=<n=<20):");
            n=sc.nextInt();
        } while (n<=0 || n>20);
        return n;
    }
    public static void lietKeSoUoc(int[] a,int x){
        for(int item : a){
            if(x% item==0){
                System.out.print(item +", ");
            }
        }
    }
}
