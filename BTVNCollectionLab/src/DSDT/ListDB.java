package DSDT;

import java.util.ArrayList;
import java.util.List;

public class ListDB {
    private List<DB> listDB;

    public ListDB() {
        this.listDB = new ArrayList<DB>();
    }

    public void add(DB db) {

        listDB.add(db);
    }

    public void printinfo() {
        for (DB db : listDB) {
            System.out.println(db);
        }
    }

    public boolean Empty() {
        return listDB.isEmpty();
    }

    public void check(String sdtt) {
        for (DB db : listDB) {
            if (sdtt.equals(db.sdt)) {
                System.out.println("True");
            } else
                System.out.println("False");
        }
    }

    public void searchDanhBa(String gtTen) {
        for (int i = 0; i < gtTen.length(); i++) {
            String c = String.valueOf(gtTen.charAt(i));
            for (DB b : listDB) {
                if (b.getName().contains(c)) {
                    System.out.println(b);
                }
            }
        }
    }

    public void edit(String sdtOld, String sdtNew) {
        for (DB db : listDB) {
            if (sdtOld.equals(db.sdt)) {
                System.out.println("Số điện thoại này bị trùng, đổi số cũ sang số mới nhập");
                db.setSdt(sdtNew);
                System.out.println(db);

            }
        }
    }
}

