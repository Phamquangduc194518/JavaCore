public class Bai1 {
    void printSn(int n){
        int count =0;
        for(int i =0; i <= n; i++){
           count = count + i;
        }
        if(3<n && n<50){
            System.out.println(count);
        }else {
            System.out.println("nhap lai n");
        }
    }
}
