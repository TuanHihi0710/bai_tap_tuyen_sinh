import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyTuyenSinh quanLyTuyenSinh = new QuanLyTuyenSinh();
        int nhap = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 4 để chọn Menu:");
                System.out.println("1: Nhập thông tin về các thí sinh dự thi");
                System.out.println("2: Hiển thị thông tin về thí sinh");
                System.out.println("3: Tìm kiếm theo số báo danh");
                System.out.println("4: Thoát khỏi chương trình");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 4) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap == 1) {
                    System.out.println("Nhập thông tin tai lieu");
                    System.out.println("1: Nhập thông tin thi sinh thi khoi A");
                    System.out.println("2: Nhập thông tin thi sinh thi khoi B");
                    System.out.println("3: Nhập thông tin thi sinh thi khoi C");
                    int chon = sc.nextInt();
                    if (chon < 1 || chon > 3) {
                        System.out.println("Nhap sai gia tri vui long nhap lai");
                    } else if (chon==1) {
                        System.out.println("Nhập thông tin thi sinh thi khoi A");
                        System.out.println("Nhap so bao danh");
                        Scanner scSoBaoDanh = new Scanner(System.in);
                        String inputSoBaoDanh = scSoBaoDanh.nextLine();
                        System.out.println("Nhap ho va ten");
                        Scanner scHoTen = new Scanner(System.in);
                        String inputHoTen = scHoTen.nextLine();
                        System.out.println("Nhap dia chi");
                        Scanner scDiaChi = new Scanner(System.in);
                        String inputDiaChi = scDiaChi.nextLine();
                        System.out.println("Nhap diem uu tien");
                        Scanner scUuTien = new Scanner(System.in);
                        String inputUuTien = scUuTien.nextLine();
                        System.out.println("Nhap mon thu nhat");
                        Scanner scMon1 = new Scanner(System.in);
                        String inputMon1 = scMon1.nextLine();
                        System.out.println("Nhap mon thu hai");
                        Scanner scMon2 = new Scanner(System.in);
                        String inputMon2 = scMon2.nextLine();
                        System.out.println("Nhap mon thu ba");
                        Scanner scMon3 = new Scanner(System.in);
                        String inputMon3 = scMon3.nextLine();
                        quanLyTuyenSinh.ThemThiSinhThiKhoiA(inputSoBaoDanh,inputHoTen,inputDiaChi,inputUuTien,inputMon1,inputMon2,inputMon3);
                    } else if (chon==2) {
                        System.out.println("Nhập thông tin thi sinh thi khoi B");
                        System.out.println("Nhap so bao danh");
                        Scanner scSoBaoDanh = new Scanner(System.in);
                        String inputSoBaoDanh = scSoBaoDanh.nextLine();
                        System.out.println("Nhap ho va ten");
                        Scanner scHoTen = new Scanner(System.in);
                        String inputHoTen = scHoTen.nextLine();
                        System.out.println("Nhap dia chi");
                        Scanner scDiaChi = new Scanner(System.in);
                        String inputDiaChi = scDiaChi.nextLine();
                        System.out.println("Nhap diem uu tien");
                        Scanner scUuTien = new Scanner(System.in);
                        String inputUuTien = scUuTien.nextLine();
                        System.out.println("Nhap mon thu nhat");
                        Scanner scMon1 = new Scanner(System.in);
                        String inputMon1 = scMon1.nextLine();
                        System.out.println("Nhap mon thu hai");
                        Scanner scMon2 = new Scanner(System.in);
                        String inputMon2 = scMon2.nextLine();
                        System.out.println("Nhap mon thu ba");
                        Scanner scMon3 = new Scanner(System.in);
                        String inputMon3 = scMon3.nextLine();
                        quanLyTuyenSinh.ThemThiSinhThiKhoiB(inputSoBaoDanh,inputHoTen,inputDiaChi,inputUuTien,inputMon1,inputMon2,inputMon3);
                    } else if (chon==3) {
                        System.out.println("Nhập thông tin thi sinh thi khoi C");
                        System.out.println("Nhap so bao danh");
                        Scanner scSoBaoDanh = new Scanner(System.in);
                        String inputSoBaoDanh = scSoBaoDanh.nextLine();
                        System.out.println("Nhap ho va ten");
                        Scanner scHoTen = new Scanner(System.in);
                        String inputHoTen = scHoTen.nextLine();
                        System.out.println("Nhap dia chi");
                        Scanner scDiaChi = new Scanner(System.in);
                        String inputDiaChi = scDiaChi.nextLine();
                        System.out.println("Nhap diem uu tien");
                        Scanner scUuTien = new Scanner(System.in);
                        String inputUuTien = scUuTien.nextLine();
                        System.out.println("Nhap mon thu nhat");
                        Scanner scMon1 = new Scanner(System.in);
                        String inputMon1 = scMon1.nextLine();
                        System.out.println("Nhap mon thu hai");
                        Scanner scMon2 = new Scanner(System.in);
                        String inputMon2 = scMon2.nextLine();
                        System.out.println("Nhap mon thu ba");
                        Scanner scMon3 = new Scanner(System.in);
                        String inputMon3 = scMon3.nextLine();
                        quanLyTuyenSinh.ThemThiSinhThiKhoiC(inputSoBaoDanh,inputHoTen,inputDiaChi,inputUuTien,inputMon1,inputMon2,inputMon3);
                    }
                } else if (nhap==2) {
                    System.out.println("Xuat thong tin ve cac tai lieu");
                    System.out.println("1: Xuat thông tin thi sin khoi A");
                    System.out.println("2: Xuat thông tin thi sin khoi B");
                    System.out.println("3: Xuat thông tin thi sin khoi C");
                    int chonGiaTri=sc.nextInt();
                    if (chonGiaTri<1||chonGiaTri>3){
                        System.out.println("Nhap sai gia tri");
                    } else if (chonGiaTri==1) {
                        System.out.println("Xuat thông tin thi sin khoi A");
                        quanLyTuyenSinh.XuatThongTinThiSinhKhoiA();
                    } else if (chonGiaTri==2) {
                        System.out.println("Xuat thông tin thi sin khoi B");
                        quanLyTuyenSinh.XuatThongTinThiSinhKhoiB();
                    } else if (chonGiaTri==3) {
                        System.out.println("Xuat thông tin thi sin khoi C");
                        quanLyTuyenSinh.XuatThongTinThiSinhKhoiC();
                    }
                } else if (nhap==3) {
                    System.out.println("Tìm kiếm theo số báo danh");
                    System.out.println("Nhap so bao danh thi sinh");
                    Scanner scSoBaoDanh = new Scanner(System.in);
                    String inputSoBaoDanh = scSoBaoDanh.nextLine();
                    quanLyTuyenSinh.TimKiemTheoSoBaoDanhThiSinh(inputSoBaoDanh);
                }

            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 4);

    }
}