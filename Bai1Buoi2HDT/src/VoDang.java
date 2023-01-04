public class VoDang extends MonPhai{

    void giangDao(){

    }

    @Override
    void luyenCong(String vukhi, KyNang kynangluyen) {
        System.out.println(vukhi + " dao" + kynangluyen.getTenKynang() +  " chém không hụt ");
    }

    @Override
    void anUong(String doAn, String thoiGian, String diaDiem) {
        System.out.println(doAn + " vịt quay" + thoiGian + " buổi tối" + diaDiem +" trong nhà");

    }
}
