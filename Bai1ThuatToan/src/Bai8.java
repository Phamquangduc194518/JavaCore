public class Bai8 {
    void tinhBai8(int n){
        int count = 0;
        for(int i = 0; i <= n;i++ ){
            count = count + (((2*i)+1)/((2*i)+2));
        }
        if(n >5){
            System.out.println(count);
        }else
            System.out.println("nhap lai n");
    }
}
