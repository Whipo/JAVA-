
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n,m;
        System.out.println("Nhap ngay: ");
        n = sr.nextInt();
        System.out.println("Nhap thang: ");
        m = sr.nextInt();
        if( n <= 31 && n > 0 && m <= 12 && m >= 1 ){
            if( n >= 20 && m == 1 || n <= 18 && m == 2 ){
                System.out.println("Cung Bao Binh");
            } else if ( n >= 19 && m == 2 && n < 30 || n <= 20 && m == 3 ) {
                System.out.println("Cung Song Ngu");
            } else if ( n >= 21 && m == 3 ||  n <= 20 && m == 4 ) {
                System.out.println("Cung Bach Duong");
            } else if ( n >= 21 && m == 4 || n <= 20 && m == 5 ) {
                System.out.println("Cung Kim Nguu");
            } else if ( n >= 21 && m == 5 || n <= 21 && m == 6 ) {
                System.out.println("Cung Song Tu");
            } else if ( n >= 22 && m == 6 || n <= 22 && m == 7 ) {
                System.out.println("Cung Cu Giai");
            } else if ( n >= 23 && m == 7 || n <= 22 && m == 8 ) {
                System.out.println("Cung Su Tu");
            } else if ( n >= 23 && m == 8 || n <= 22 && m == 9 ) {
                System.out.println("Cung Xu Nu");
            } else if ( n >= 23 && m == 9 || n <= 23 && m == 10 ) {
                System.out.println("Cung Thien Binh");
            } else if ( n >= 24 && m == 10 || n <= 22 && m == 11 ) {
                System.out.println("Cung Bo Cap");
            } else if ( n >= 23 && m == 11 || n <= 21 && m == 12 ) {
                System.out.println("Cung Nhan Ma");
            } else if ( n >= 22 && m == 12 || n <= 19 && m == 1 ) {
                System.out.println("Cung Ma Ket");
            }
            else {
                System.out.println("Khong co trong 12 cung hoang dao");
            }
        }
        else {
            System.out.println("Du lieu nhap sai!");
        }
    }
}
