public class Bai4 {
    void tinhBai4(int n) {
        float Sum = 0;
        for (int i = 1; i <= n; i++) {
            Sum =Sum +(float) 1/(2*i)+1;
        }
        System.out.println(Sum);
    }
}
