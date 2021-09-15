package TH2;
import java.util.Scanner;
public class bai3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        System.out.println("Giải chương trình bậc 2:");
        System.out.println("a =");
        float a = sc.nextFloat();
        System.out.println("b =");
        float b = sc.nextFloat();
        System.out.println("c =");
        float c = sc.nextFloat();
        float n1,n2;
        if(a == 0.0){
            if(b == 0.0)
                System.out.println("Phương trình vô nghiệm");
            else 
                System.out.println("Phương trình có nghiệm: n=" + (float)-c/b);;
        } 
        else {
            float delta = b*b - 4*a*c;
            if(delta>0){
                n1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                n2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phương trình có 2 nghiệm phân biệt: \n n1=" + (float)n1+ "\n n2=" + (float)n2);
            } else if (delta == 0){
                n1 = (-b / (2*a));
                System.out.println("Phương trình có nghiệm kép: \n n=" + (float)n1);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
