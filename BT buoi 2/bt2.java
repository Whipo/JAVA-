import java.util.Scanner;
public class bt2 {
    public static void main(String[] args) {
        Scanner tg = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhap vao 3 so nguyen: ");
        a = tg.nextInt();
        b = tg.nextInt();
        c = tg.nextInt();
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            System.out.print(" Day la Tam Giac");
        }
        if ((a == b) || (b == c) || (c == a)) {
            System.out.println(" va la Tam Giac can !");
        } else if ((a == b) && (b == c) && (c == a)) {
            System.out.println(" va la Tam Giac deu !");
        } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
            System.out.println(" va la Tam Giac vuong !");
        } else {
            System.out.println(" nhung khong vuong, can, deu !");
        }
    }
}

