public class Testddoixung {
    public void dx() {
        int count=0;
        String string = "Toiiot";
        char[] a = string.toCharArray();
        int b = string.length()-1;
        for(int i=0; i<string.length()/2;i++) {
            if (a[i] == a[b - i]) {
                ++count;
            }
        }
        if(count == (b+1)/2){
            System.out.println("dx");
        }else {
            System.out.println("kdx");
        }
    }
}
