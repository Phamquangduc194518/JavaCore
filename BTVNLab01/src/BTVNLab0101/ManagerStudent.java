package BTVNLab0101;

public class ManagerStudent {
    People s1;
    People s2;
    People s3;

    String getInfo()
    {
        String infos1 = s1.info();
        String infos2 = s2.info();
        String infos3 = s3.info();

        return infos1 + "\n" + infos2 + "\n" + infos3;
    }

    void info(){
        System.out.println(getInfo());
    }

    People findByName(String name){
        if(s1.name.equals(name)){
            return s1 ;
        }
            return null;
    }
}
