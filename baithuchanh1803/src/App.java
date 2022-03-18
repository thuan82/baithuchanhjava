import shapes.HinhTron;
import shapes.Hinhchunhat;

public class App {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        Hinhchunhat hcn = new Hinhchunhat();

        //Hinh tròn
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.inChuVi();
        ht.TinhDienTinh();
        ht.inDienTich();

        System.out.print("\n\n");
        //Hình chữ nhật
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTinh();
        hcn.inChuVi();
        hcn.inDienTich();
        
    }
}