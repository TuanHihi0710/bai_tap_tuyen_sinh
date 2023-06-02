public class KhoiA extends ThiSinh{
    private String mon1;
    private String mon2;
    private String mon3;
    public KhoiA(){}
    public KhoiA(String inputSoBaoDanh, String inputHoTen, String inputDiaChi, String inputUuTien, String inputMon1,String inputMon2,String inputMon3){
        super(inputSoBaoDanh,inputHoTen,inputDiaChi,inputUuTien);
        mon1=inputMon1;
        mon2=inputMon2;
        mon3=inputMon3;
    }

    public String getMon1() {
        return mon1;
    }

    public String getMon2() {
        return mon2;
    }

    public String getMon3() {
        return mon3;
    }
    public void setMon1(String inputMon1){
        mon1=inputMon1;
    }
    public void setMon2(String inputMon2){
        mon2=inputMon2;
    }public void setMon3(String inputMon3){
        mon3=inputMon3;
    }
    public void XuatThongTinThiSinhKhoiA(){
        System.out.println("So bao danh: "+getSoBaoDanh());
        System.out.println("Ho ten: "+getHoTen());
        System.out.println("Dia chi: "+getDiaChi());
        System.out.println("Uu tien: "+getUuTien());
        System.out.println("Mon 1: "+getMon1());
        System.out.println("Mon 2: "+getMon2());
        System.out.println("Mon 3: "+getMon3());
    }
}
