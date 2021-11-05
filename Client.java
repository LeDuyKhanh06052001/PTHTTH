import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Dem tu\n2. Dao chuoi\nExit");
            String Chon=sc.nextLine();
            // nhap.nextLine();
            try {
                Registry reg=LocateRegistry.getRegistry(6565);
                Interface citf=(Interface) reg.lookup("Service1");
                switch (Chon) {
                    case "1":
                        System.out.println("Nhap chuoi: ");
                        String s=sc.nextLine();
                        System.out.println("So tu: "+citf.demtu(s));
                    break;
                    case "2":
                        System.out.println("Nhap chuoi: ");
                        String s2=sc.nextLine();
                        System.out.println("Dao nguoc: "+citf.daochuoi(s2));
                    break;
                    case "Exit":
                        System.exit(0);
                    default:
                        System.out.println("Khong hop le:");
                    break;
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}
