import org.w3c.dom.ls.LSOutput;

public class MyString {
    public MyString(String chuoi) {
//        sum(chuoi);
//        sumNumber(chuoi);
//        sapsep(chuoi);
        selectString(chuoi);
    }

    public void sum(String chuoi){
        int sum1=0;
        System.out.println("Tổng mã ACSII12");
        for(int i =0; i<chuoi.length(); i++){
            char c = chuoi.charAt(i);
            sum1+=c;
        }
        System.out.println(sum1);
    }

    public void sumNumber(String chuoi){
        int sum1=0;
        System.out.println("Tổng số có trong chuỗi");
        for(int i=0; i<chuoi.length();i++ ){
            char c = chuoi.charAt(i);
            if(c>'0' && c<'9'){
                sum1+=c-'0';
            }
        }
        System.out.println(sum1);
    }

    public void sapsep(String chuoi){
        int temp = 0,c;
        int value=chuoi.charAt(0);
        for(int i=0; i<chuoi.length()-1; i++) {
            for (int j = 0; j < chuoi.length(); j++) {
                c = chuoi.charAt(i);
                if (c < value) {
                    temp = c;
                    c = value;
                    value = temp;
                    System.out.println(c-'0');
                }
            }
        }
        System.out.println(chuoi);
    }

    public void selectString(String chuoi){
        for(int i=0; i<chuoi.length(); i++){
            char c= chuoi.charAt(i);
                    if(c>=65 && c<=90){
                        System.out.print(c-'0'+'0');
                        System.out.print(c);
                    }
        }
    }

}
