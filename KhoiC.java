public class KhoiC extends KhoiA{
    public KhoiC(){}
    public KhoiC(String inputSoBaoDanh, String inputHoTen, String inputDiaChi, String inputUuTien, String inputMon1,String inputMon2,String inputMon3){
        super(inputSoBaoDanh,inputHoTen,inputDiaChi,inputUuTien,inputMon1,inputMon2,inputMon3);
    }
    public void XuatThongTinThiSinhKhoiC(){
        System.out.println("So bao danh: "+getSoBaoDanh());
        System.out.println("Ho ten: "+getHoTen());
        System.out.println("Dia chi: "+getDiaChi());
        System.out.println("Uu tien: "+getUuTien());
        System.out.println("Mon 1: "+getMon1());
        System.out.println("Mon 2: "+getMon2());
        System.out.println("Mon 3: "+getMon3());
    }
}
