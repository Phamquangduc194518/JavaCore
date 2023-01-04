package BTVNLab0101;

public class People {
    String name;
    String classroom;
    String dateOfBirth;
    float mathScore;
    float physicsScore;
    float ChemistryScore;
    float EnglishScore;
    float mediumScore;

    String info() {
       return  "Tên: "+name +
        "Lớp: "+classroom +
        "Ngày tháng năm sinh: "+dateOfBirth +
        "Điểm Toán: "+mathScore +
        "Điểm Lý: "+physicsScore +
        "Điểm Hóa: "+ChemistryScore +
        "Điểm Anh: "+EnglishScore +
        "Điểm Trung Bình: "+mediumScore ;
    }
    void printInfo(){
       System.out.println(info());
    }

}


