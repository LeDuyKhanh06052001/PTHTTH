package TH2;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        n=sc.nextInt();
        if(n>0)
        {
            if(ktsnt(n)==1)
            System.out.println(n+ " Là số nguyên tố");
            else
            System.out.println(n+ " Không là số nguyên tố");
        }
    }
    public static int ktsnt(int n)
     {
    int dem=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        dem++;    
    }
    if(dem==2)
    return 1;
    else return 0;
}
}