package BTVNLab0101;

public class Main {
    public static void main(String[] args) {
//        B1
//        Topics a1 = new Topics();
//        a1.name="Truyện cười";
//        Topic b1 = new Topic();
//        b1.StoryName="Ba chàng hiệp sĩ";
//        Story c1 = new Story();
//        c1.author="K.Der.Hermes";
//        c1.date="12-10-2956";
//        c1.contents="Ăn xong, khi đã lên xe đi được khá xa, " +"\n"+
//                "bà vợ mới sực nhớ là mình quên cặp kính trên bàn ăn. " +"\n"+
//                "Suốt quãng đường trở lại quán, ông chồng luôn mồm cằn nhằn tính hay quên của bà vợ.";
//
//        System.out.println("Tên chủ đề: " +a1.name);
//        System.out.println("Tên truyện:"  +b1.StoryName);
//        System.out.println("Tên tác giả: " +c1.author);
//        System.out.println("Ngày xuất bản: " +c1.date);
//        System.out.println("Nội dung truyện: " +c1.contents);



        ManagerStudent mg= new ManagerStudent();
        mg.s1= new People();
        mg.s1.name = "Nghị";
        mg.s1.classroom="1A";
        mg.s1.dateOfBirth="27-9-2017";
        mg.s1.mathScore=9.0f;
        mg.s1.physicsScore=9.5f;
        mg.s1.ChemistryScore=9.0f;
        mg.s1.EnglishScore=9.5f;
        mg.s1.mediumScore=9.0f;
        mg.s1.printInfo();
    }
}