public class Bai27 {
    void tinhBai27(int n){

        for(int i =0; i<=n; i++){
            if(i%2!=0) {
                if(i == 7 || i== 21 || i == 41){
                    continue;
                }
                System.out.print(i + " ");
             }
        }
    }
}
