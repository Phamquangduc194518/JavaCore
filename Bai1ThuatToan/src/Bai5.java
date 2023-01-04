public class Bai5 {
    void tinhPhanSoLe(int n){
        int count = 0;
        for(int i = 0; i <= n;i++ ){
            count = count + 1/((2*i)+1);
        }
        if(n >= 2){
            System.out.println(count);
        }else
            System.out.println("nhap lai n");
    }
}
