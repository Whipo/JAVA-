import java.util.Scanner;
public class Bai1 {
          public static double tbc(int a[]){
              int total = 0, dem = 0;
              for(int i = 0 ; i<a.length ; i++)
                  if (i % 2 == 0 && a[i] % 2 != 0) {
                      total += a[i];
                      dem++;
                  }
              int av = total / dem;
              return (av);
         }
    public static int tim(int a[], int n) {
        int temp, pos = 0;
        temp = a[0];
        for (int i = 0; i < n; i++) {
            if (temp > a[i]) {
                temp = a[i];
                pos = i;
            }
        }
        return (pos + 1);
    }
    public static boolean kt(int n) {
        int sqr = (int) Math.sqrt(n);
        return (sqr * sqr == n);
    }

    public static boolean ktsnt(int n){
        if(n<2){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void sapxep(int a[] ) {
        int temp = a[0];
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static void hienthi(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu trong mang: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("\nTrung binh cong: " + tbc(a));
        System.out.print("\nSo nho nhat trong mang o vi tri thu: " + tim(a, n));
        System.out.print("\nCac so chinh phuong trong mang: ");
        for (int i = 0; i < n; i++) {
            if (kt(a[i])) {
                System.out.print( a[i] + " ");
            }
        }
        System.out.print("\nSo nguyen to trong mang: ");
        for (int i=0; i<n; i++){
            if(ktsnt(a[i])==true){
                System.out.print(" " + a[i]);
            }
        }
        sapxep(a);
        System.out.print("\nMang sap xep tang dan: ");
        hienthi(a);
    }
}
