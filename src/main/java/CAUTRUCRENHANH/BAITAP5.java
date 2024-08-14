/*
TINH TIEN TAXI
 */
package CAUTRUCRENHANH;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BAITAP5 {
    public static void main(String[] args) {
        double km;
        double tientra;
        Scanner sc= new Scanner (System.in);
        System.out.println("=====Tinh Tien Taxi=====");
        //b1 nhap so km
        System.out.print("Nhap so km: ");
        km=sc.nextDouble();
        // b2.1 tinh tien
        if(km<=1){
            tientra=15000;
        }  else if(km <=5){
          tientra= 15000 + (km-1)*13500;
    } else{
            tientra=15000 +4*13500 +(km-5)*11000;
        }
        //b2.2 tien giam
        if(km>120){
            tientra=tientra-tientra*0.1;
        }
        //b3 xuat kq
        
    }
}
