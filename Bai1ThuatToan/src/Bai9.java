public class Bai9 {
    void tinhBai9(int n){
        int Fn =1;
        for(int i = 1; i<=n; i++){
            Fn = Fn *i;
        }if(n>6){
            System.out.println(Fn);
        }else {
            System.out.println("nhap lai n");
        }
    }
}
