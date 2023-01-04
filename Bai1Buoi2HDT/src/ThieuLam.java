public class ThieuLam extends MonPhai{

    void tungkinh(){
        System.out.println("đang tụng kinh");
    }

    @Override
    void luyenCong(String vukhi, KyNang kynangluyen){
        System.out.println( " Vũ khí : " + vukhi + " luyện : "  +  kynangluyen.getTenKynang()  );
    }


    @Override
    void anUong(String doAn, String thoiGian, String diaDiem) {
        System.out.println( "Ăn uống : "  + doAn   + " thời gian : " +  thoiGian + " địa điểm :" +  diaDiem );

    }
}
