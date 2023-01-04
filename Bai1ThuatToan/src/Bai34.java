public class Bai34 {
    float scoreMath;
    float scorePhy;
    float scoreSub;
    float maHocSinh;
    String name;
    float diemTB;

    public void tinhDiemTrungBinh(float scoreMath, float scorePhy, float scoreSub){
        diemTB = (scoreMath + scorePhy+scoreSub)/3;
    }
    public void xeploaiHS(){
        if (diemTB>=8){
            System.out.println("hs Gioi");
        } else if (7<=diemTB && diemTB <8) {
            System.out.println("hs Kha");
        } else if (5<= diemTB && diemTB<7) {
            System.out.println("hs TB");
        }else {
            System.out.println("hs yeu");
        }
    }
}
