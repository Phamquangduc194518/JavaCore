import java.io.Serializable;

public class Account implements Serializable {
    private String tk;
    private String mk;
    private String name;
    private String nPhone;

    public Account(String tk, String mk, String name, String nPhone) {
        this.tk = tk;
        this.mk = mk;
        this.name = name;
        this.nPhone = nPhone;
    }

    public Account(){

    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnPhone() {
        return nPhone;
    }

    public void setnPhone(String nPhone) {
        this.nPhone = nPhone;
    }
    public String print(){
        return "\n"+tk.trim()+"-"+mk+"-"+name+"-"+nPhone+"\n";
    }
}
