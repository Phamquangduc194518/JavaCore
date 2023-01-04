public class Bai2 {
    void tinhTongBinhPhuong(int n){
        int count = 0;
        for(int i = 1; i <= n;i++ ){
            count = count + (i*i);
        }
        if(5<= n && n<=20){
            System.out.println(count);
        }else
        System.out.println("nhap lai n");
    }
}
