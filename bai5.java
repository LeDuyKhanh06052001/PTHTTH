package TH2;
import java.util.Scanner;
public class bai5 {package TH2;

public class Diem {
    
}

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Tính tổng dãy số thực");
        System.out.print("Dãy số thực: ");
        int n = sc.nextInt();
        float [] a = new float[n];
        float total =0;
        for(int i=0; i<n; ++i) {
            System.out.print("Số thức " + (int)(i+1) + ": ");
            a[i] = (float) sc.nextFloat();
        }
        for(int i=0; i<n; ++i) 
            total +=a[i];        
        System.out.println("Tổng giá trị trong mảng: "+ (float)total);

    }
}

