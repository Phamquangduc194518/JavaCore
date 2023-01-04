public abstract class MonPhai {

    private KyNang kyNang;
    private String tenMonPhai;
    private String tenTruongMon;
    private String noiO;
    private String monQuy;
    private String moTa;



    public String getTenMonPhai() {
        return tenMonPhai;
    }

    public void setTenMonPhai(String tenMonPhai) {
        this.tenMonPhai = tenMonPhai;
    }

    public String getTenTruongMon() {
        return tenTruongMon;
    }

    public void setTenTruongMon(String tenTruongMon) {
        this.tenTruongMon = tenTruongMon;
    }

    public String getNoiO() {
        return noiO;
    }

    public void setNoiO(String noiO) {
        this.noiO = noiO;
    }

    public KyNang getKyNang() {
        return kyNang;
    }

    public void setKyNang(KyNang kyNang) {
        this.kyNang = kyNang;
    }

    public String getMonQuy() {
        return monQuy;
    }

    public void setMonQuy(String monQuy) {
        this.monQuy = monQuy;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    void printInFom(){
        System.out.println("Tên môn phái : " + tenMonPhai);
        System.out.println("Tên trưởng môn : " + tenTruongMon);
        kyNang.printInfo();
        System.out.println("Nơi ở : " + noiO);
        System.out.println("môn quy : " + monQuy);
        System.out.println("mô tả : " + moTa);
    }

     void soTai(MonPhai o){
        if(this.kyNang.getSatThuong() == o.kyNang.getSatThuong()){
            System.out.println(this.tenMonPhai + " và " + o.tenMonPhai + "hòa nhau");
        } else if (this.kyNang.getSatThuong() > o.kyNang.getSatThuong()) {
            System.out.println(this.tenMonPhai +  " thắng " + o.tenMonPhai);
        }else {
            System.out.println(this.tenMonPhai + " thua " + o.tenMonPhai);
        }
     }

    abstract void luyenCong(String  vukhi, KyNang kynangluyen );
    abstract void anUong(String doAn, String thoiGian, String diaDiem);
}
