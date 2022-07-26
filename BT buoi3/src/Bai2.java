import java.lang.String;
import java.util.Scanner;


public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu: ");
        String s = scanner.nextLine();
        System.out.println("Chuoi vua nhap la: " + s);
        s = xoaKhoangTrang(s);
//        s = xoaso(s);
        System.out.println("Chuoi sau khi sua: " + s);
    }

    public static String xoaKhoangTrang(String s) {
        return s.trim().replaceAll("\\s+", " ");
    }
//    public static String xoaso(){
//
//    }
}
