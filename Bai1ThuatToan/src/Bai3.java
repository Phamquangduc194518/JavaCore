public class Bai3 {
    void tinhTongPhanSo(int n) {
        int count =0;
        for (int i = 1; i <= n; i++) {
            count = count + (1/i);
        }

        if ((n >= 7)) {
            System.out.println(count);
        } else {
            System.out.println("nhap lai n ");
        }
    }
}
