package TH2;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) throws Exception {    
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Tính tổng từ 1 đến n");      
            System.out.println("Cho n= 0 để kết thúc");  
            System.out.print("Nhập n= ");        
            int n = sc.nextInt();
            if (n==0) 
            break;            
            int total = 0;
            for(int i=0; i<=n; i++) 
                total += i;            
            System.out.println("Tổng từ 1 đến " + n + " là: " + total);            
        } 
    }
}
