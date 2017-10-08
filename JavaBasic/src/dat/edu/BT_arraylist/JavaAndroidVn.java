package dat.edu.BT_arraylist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class HocSinh implements Serializable {

    private String ten;
    private int tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}

public class JavaAndroidVn {

    public static void main(String[] args) throws IOException {
        ArrayList<HocSinh> listHS = new ArrayList(); // Khai báo 1 đối tượng ArrayList, các phần tử tạo ra từ lớp HocSinh

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số học sinh: ");
        int n = input.nextInt();

        //Lấy dữ liệu và ghi vào file
        try {
            FileOutputStream f = new FileOutputStream("E:\\hocsinh.dat");
            ObjectOutputStream oOT = new ObjectOutputStream(f); // Sử dụng để ghi file theo từng Object
            for (int i = 0; i < n; i++) {
                HocSinh x = new HocSinh(); //Tạo đối tượng x để lưu tạm thời dữ liệu
                System.out.println("Học sinh thứ " + i + ": ");
                input.nextLine(); //Dòng này để tránh bị trượt dòng!

                System.out.print("Tên: ");
                String tenX = input.nextLine();

                System.out.print("Tuổi: ");
                int tuoiX = input.nextInt();

                x.setTen(tenX);
                x.setTuoi(tuoiX);

                oOT.writeObject(x); // Ghi  Object là đối tượng x xuống file

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaAndroidVn.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        //Đọc dữ liệu từ file, lấy các object ra rồi gán vào ListHS
        try {
            FileInputStream f2 = new FileInputStream("E:\\hocsinh.dat");
            ObjectInputStream oIT = new ObjectInputStream(f2); // Sử dụng để đọc file theo từng Object
            HocSinh x = new HocSinh(); //Tạo đối tượng x để lưu tạm thời dữ liệu
            for (int i = 0; i < n; i++) {
                x = (HocSinh) oIT.readObject(); //Đọc Object đầu tiên ép kiểu về kiểu SinhVien sau đó gán bằng đối tượng a1
                listHS.add(x);
            }
            oIT.close();
            f2.close();
        } catch (IOException io) {
            System.out.println("Có lỗi xảy ra!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy class");
        }

        //In thông tin ra ngoài!
        System.out.println("Thông tin danh sách vừa nhập vào là: ");
        for (int i = 0; i < listHS.size(); i++) {
            System.out.print("Học sinh thứ " + i);
            System.out.print(" - Tên " + listHS.get(i).getTen() + " Tuổi: " + listHS.get(i).getTuoi() + "\n");
        }


    }
}
