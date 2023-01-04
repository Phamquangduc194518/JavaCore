public class CaiBang extends MonPhai{

    void anXin(){
        System.out.println("Lạy ông lạy bà");
    }

    @Override
    void luyenCong(String vukhi, KyNang kynangluyen) {
        System.out.println("Vũ khí :" + vukhi + " luyện " + kynangluyen.getTenKynang());
    }

    @Override
    void anUong(String doAn, String thoiGian, String diaDiem) {
        System.out.println("Đồ ăn" + doAn + " thời gian : " + thoiGian +  " địa điểm" + diaDiem);
    }
}
