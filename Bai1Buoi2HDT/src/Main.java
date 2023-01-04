public class Main {
    public static void main(String[] args) {

            NoiCong  noiCong = new NoiCong();
            noiCong.setMoTa("1234");
            noiCong.setTenKynang("hơi nóng như lửa");
            noiCong.setThuocTinh(" không biết");
            noiCong.setSatThuong(700);

            NgoaiCong ngoaiCong = new NgoaiCong();
            ngoaiCong.setTenKynang("vạn hoa đồng");
            ngoaiCong.setMoTa(" 5679");
            ngoaiCong.setThuocTinh(" không rõ ");
            ngoaiCong.setSatThuong(650);

            KyNang kynangluyen = new KyNang();
            kynangluyen.setSatThuong(123);
            kynangluyen.setMoTa(" rèn vũ khí");
            kynangluyen.setThuocTinh(" luyện vũ khí");
            kynangluyen.setTenKynang(" bầu trời rực sáng");

            ThieuLam thieuLam  = new ThieuLam();
            thieuLam.setTenMonPhai("vịnh xuân quyền");
            thieuLam.setTenTruongMon(" ô la la");
            thieuLam.setNoiO("trong chùa");
            thieuLam.setKyNang(noiCong);
            thieuLam.setMoTa(" dùng tay đánh nhau");
            thieuLam.setMonQuy(" không dùng để giết người");
            thieuLam.luyenCong("tay không",kynangluyen);
            thieuLam.anUong("cơm", " buổi tối"," trên núi");
            thieuLam.tungkinh();
            thieuLam.printInFom();
            System.out.println("---------------");

            CaiBang caiBang  = new CaiBang();
            caiBang.setTenMonPhai("cầu bổng đánh chó");
            caiBang.setTenTruongMon( "hoa đà");
            caiBang.setMoTa(" được phép để tóc dài");
            caiBang.setNoiO(" nơi nào cũng được");
            caiBang.setMonQuy(" ai mạnh người đó thắng");
            caiBang.luyenCong(" có gì dùng lấy",  kynangluyen);
            caiBang.anXin();
            caiBang.anUong("có gì ăn lấy", " lúc nào cũng được","ngồi đâu cũng được");
            caiBang.setKyNang(ngoaiCong);
            caiBang.printInFom();
            caiBang.soTai(thieuLam);
    }
}