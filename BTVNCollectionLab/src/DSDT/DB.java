package DSDT;

public class DB {
    String name;
    String sdt;

    public DB(String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }

    public DB() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "DSDT.DB{" +
                "name='" + name + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }


}
