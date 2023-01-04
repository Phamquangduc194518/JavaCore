public class Bai6 {
    void tinhPhanSoLe(int n){
        int count = 0;
        for(int i = 1; i <= n;i++ ){
            count = count + 1/(i*(i+1));
        }
        if(n > 6){
            System.out.println(count);
        }else
            System.out.println("nhap lai n");
    }
}
