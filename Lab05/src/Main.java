public class Main {
    public static void main(String[] args) {
        Main a= new Main();
        a.dau();;
    }


    public void sum(String s){
        int sumChar=0;
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c>'0' && c<'9' ){
                sumChar += c-'0';
            }
        }
        System.out.print(sumChar);
    }

    public void dau(){
        String s= "___test____and_____test";
        System.out.println(s.trim());
    }
}