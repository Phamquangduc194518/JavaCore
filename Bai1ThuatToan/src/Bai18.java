public class Bai18 {
    void tinhBai18(int n) {

        for (int i = 1; i <= n; i++) {
            if(n%i==0) {


                if (i % 2 == 0) {
//                    System.out.print(i + " ");
                }
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
