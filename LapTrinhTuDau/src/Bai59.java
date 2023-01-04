public class Bai59 {
    void tinhBai59(int thang, int nam){
        switch (thang){
            case 1: case 3: case 5: case 7: case  8: case 10 : case 12:
                System.out.println("thang co 30 ngay");
            case 4 : case 6 : case 9 : case 11:
                System.out.println("thang co 31 ngay");
            case 2:
                if (nam % 4 == 0 || nam % 100 == 0 && nam % 400 == 0) {
                    System.out.println("thang co 28 ngay");
                }else {
                    System.out.println("thang co 29 ngay");
                }
        }
    }
}
