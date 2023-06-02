public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String uuTien;

    public ThiSinh(){}
    public ThiSinh(String inputSoBaoDanh, String inputHoTen, String inputDiaChi, String inputUuTien){
        soBaoDanh=inputSoBaoDanh;
        hoTen=inputHoTen;
        diaChi=inputDiaChi;
        uuTien=inputUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getUuTien() {
        return uuTien;
    }
    public void setSoBaoDanh(String inputSoBaoDanh){
        soBaoDanh=inputSoBaoDanh;
    }
    public void setHoTen(String inputHoTen){
        hoTen=inputHoTen;
    }
    public void setDiaChi(String inputDiaChi){
        diaChi=inputDiaChi;
    }
    public void setUuTien(String inputUuTien){
        uuTien=inputUuTien;
    }
}
