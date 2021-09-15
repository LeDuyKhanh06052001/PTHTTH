package TH2;
public class Diem {
    int x,y;
    //Phương thức gán tọa độ cho một điểm
    void nhaptoado(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    //Phương thức in ra màn hình tọa độ điểm theo dạng (x,y)
    void intoado(){
        System.out.println("("+x +"," +y+")");
    }
    //Phương thức tính khoảng cách từ điểm đó đến gốc tọa độ (0,0)
    double kc(int x, int y)
    {
        double kq=Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
        return kq;   
    }
    public static void main(String[] args) {
        Diem a = new Diem();
        Diem b = new Diem();
        a.nhaptoado(2, 3);
        b.nhaptoado(3, 4);
        a.intoado();
        b.intoado();
        System.out.println("Khoảng cách : "+a.kc(5, 4));
    }
}
