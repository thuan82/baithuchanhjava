package shapes;
import java.util.Scanner;
public class Hinhchunhat {
    float cd;
    float cr;
    float cv;
    float dt;
    public void nhapChieuDai()
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua HCN: ");
        cd = sc.nextFloat();
    }
    public void nhapChieuRong()
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Nhap chieu rong cua HCN: ");
        cr = sc.nextFloat();
    }
    public void tinhChuVi()
    {
        cv = (cd + cr) * 2;
    }
    public void tinhDienTinh()
    {
        dt = cd * cr;
    }
    public void inChuVi()
    {
        System.out.print("Chu vi HCN la: " + cv);
    }
    public void inDienTich()
    {
        System.out.print("\nDien tich HCN la: " + dt);
    }
}