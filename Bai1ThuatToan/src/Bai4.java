public class Bai4 {
    void tinhTongPhanSox2(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count = count + (1/(2*i));
        }
        if (n>9) {
            System.out.println(count);
        } else {
            System.out.println("nhap lai n ");
        }
    }
}
