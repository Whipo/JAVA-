import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {
        Scanner tinh = new Scanner(System.in);
        int n;
        int tong = 0;
        do {
            System.out.println("Nhap n= ");
            n = tinh.nextInt();
        }
        while ( n <= 0 );
        for( int i = 1; i <= n; i++){
            if( n%i ==0 ){
                tong +=i;
            }
        }
        System.out.println("Tong cac uoc cua " + n + ": " + tong);
    }
}
