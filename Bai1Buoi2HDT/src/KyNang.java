public class KyNang {
    private String tenKynang;
    private int satThuong;
    private String thuocTinh;
    private String moTa;


    public String getTenKynang() {
        return tenKynang;
    }

    public void setTenKynang(String tenKynang) {
        this.tenKynang = tenKynang;
    }

    public int getSatThuong() {
        return satThuong;
    }

    public void setSatThuong(int satThuong) {
        this.satThuong = satThuong;
    }

    public String getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(String thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }


    void printInfo(){
        System.out.println("tên kỹ năng : " + tenKynang);
        System.out.println("sát thương kỹ năng : " + satThuong);
        System.out.println("thuộc tính kỹ năng : " + thuocTinh);
        System.out.println("mô tả kỹ năng : " + moTa);

    }
}
