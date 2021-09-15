package TH2;
public class PhanSo {
    int tu,mau;
    void nhapphanso(int a, int b)
    {
        this.tu=a;
        this.mau=b;
    }
    //Phương thức in phân số ra màn hình
    void inphanso(int a,int b)
    {
        System.out.println("Phân số là: "+a+"/"+b);
    }
    //Phương thức nghịch đảo phân số
    void nghichdao(int a, int b)
    {
        System.out.println("Phân số nghịch đảo là: "+b+"/"+a);
    }
    //Phương thức trả về giá trị thực của phân số
    double giatri(double a, double b)
    {
        double ketqua=a/b;
        return ketqua;    
    }
    //Hàm cộng/trừ/nhân/chia 2 phân số
    double cong(double a1, double b1, double a2, double b2)
    {
        double ketqua=(((a1*b2)+(a2*b1))/(b1*b2));
        return ketqua;
    }
    double tru(double a1, double b1, double a2, double b2)
    {
        double ketqua=(((a1*b2)-(a2*b1))/(b1*b2));
        return ketqua;
    }
    double nhan(double a1, double b1,double a2,double b2)
    {
        double ketqua=(a1*a2)/(b1*b2);
        return ketqua;
    }
    double chia(double a1, double b1,double a2,double b2)
    {
        double ketqua=(a1*b2)/(b1*a2);
        return ketqua;
    }
    public static void main(String[] args) {
        PhanSo x=new PhanSo();
        PhanSo y=new PhanSo();
        x.inphanso(2, 3);
        y.nghichdao(2, 3);
        System.out.println("Giá trị thực: "+x.giatri(2, 5));
        System.out.println("Kết quả cộng phân số: "+x.cong(2, 3, 4, 5));
        System.out.println("Kết quả trừ phân số: "+x.tru(4, 5, 6, 7));
        System.out.println("Kết quả nhân phân số: "+x.nhan(7, 6, 8, 9));
        System.out.println("Kết quả chia phân số: "+x.chia(2, 4, 3, 5));
    }
}

