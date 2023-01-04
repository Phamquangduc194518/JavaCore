public class Testddoixung {
    public void dx() {
        String string = "ToiioT";
        char[] a = string.toCharArray();
        for (int i = 0; i < string.length(); i++){

            for(int j=string.length()-1; j>0;j--){
                if(a[i]==a[j]){
                    System.out.println("chuoi nay dx");
                }else
                    System.out.println("ko dx");
            }
        }
    }
}
