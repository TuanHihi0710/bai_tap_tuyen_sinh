import java.util.ArrayList;
import java.util.List;

public class QuanLyTuyenSinh {
    private List<KhoiA> danhSachTuyenSinhKhoiA;
    private List<KhoiB> danhSachTuyenSinhKhoiB;
    private List<KhoiC> danhSachTuyenSinhKhoiC;
    public QuanLyTuyenSinh(){
        danhSachTuyenSinhKhoiA = new ArrayList<>();
        danhSachTuyenSinhKhoiB = new ArrayList<>();
        danhSachTuyenSinhKhoiC = new ArrayList<>();
    }
    public void ThemThiSinhThiKhoiA(String inputSoBaoDanh, String inputHoTen, String inputDiaChi, String inputUuTien, String inputMon1,String inputMon2,String inputMon3){
        KhoiA khoiA = new KhoiA(inputSoBaoDanh,inputHoTen,inputDiaChi,inputUuTien,inputMon1,inputMon2,inputMon3);
        danhSachTuyenSinhKhoiA.add(khoiA);
    }
    public void ThemThiSinhThiKhoiB(String inputSoBaoDanh, String inputHoTen, String inputDiaChi, String inputUuTien, String inputMon1,String inputMon2,String inputMon3){
        KhoiB khoiB = new KhoiB(inputSoBaoDanh,inputHoTen,inputDiaChi,inputUuTien,inputMon1,inputMon2,inputMon3);
        danhSachTuyenSinhKhoiB.add(khoiB);
    }public void ThemThiSinhThiKhoiC(String inputSoBaoDanh, String inputHoTen, String inputDiaChi, String inputUuTien, String inputMon1,String inputMon2,String inputMon3){
        KhoiC khoiC = new KhoiC(inputSoBaoDanh,inputHoTen,inputDiaChi,inputUuTien,inputMon1,inputMon2,inputMon3);
        danhSachTuyenSinhKhoiC.add(khoiC);
    }
    public void XuatThongTinThiSinhKhoiA(){
        for (int i = 0; i < danhSachTuyenSinhKhoiA.size(); i++) {
            danhSachTuyenSinhKhoiA.get(i).XuatThongTinThiSinhKhoiA();
        }
    }
    public void XuatThongTinThiSinhKhoiB(){
        for (int i = 0; i < danhSachTuyenSinhKhoiB.size(); i++) {
            danhSachTuyenSinhKhoiB.get(i).XuatThongTinThiSinhKhoiB();
        }
    }
    public void XuatThongTinThiSinhKhoiC(){
        for (int i = 0; i < danhSachTuyenSinhKhoiC.size(); i++) {
            danhSachTuyenSinhKhoiC.get(i).XuatThongTinThiSinhKhoiC();
        }
    }
    public void TimKiemTheoSoBaoDanhThiSinh(String inputSoBaoDanh){
        for (int i = 0; i < danhSachTuyenSinhKhoiA.size(); i++) {
            if (danhSachTuyenSinhKhoiA.get(i).getSoBaoDanh().equals(inputSoBaoDanh)){
                danhSachTuyenSinhKhoiA.get(i).XuatThongTinThiSinhKhoiA();
            }
        }
        for (int i = 0; i < danhSachTuyenSinhKhoiB.size(); i++) {
            if (danhSachTuyenSinhKhoiB.get(i).getSoBaoDanh().equals(inputSoBaoDanh)){
                danhSachTuyenSinhKhoiB.get(i).XuatThongTinThiSinhKhoiB();
            }
        }
        for (int i = 0; i < danhSachTuyenSinhKhoiC.size(); i++) {
            if (danhSachTuyenSinhKhoiC.get(i).getSoBaoDanh().equals(inputSoBaoDanh)){
                danhSachTuyenSinhKhoiC.get(i).XuatThongTinThiSinhKhoiC();
            }
        }
    }
}
