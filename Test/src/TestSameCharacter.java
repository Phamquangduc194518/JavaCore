import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestSameCharacter {
    public void test(){
        String string ="Em den roi anh cuoi hahaha";
        int count =1;
        String newS= string.replaceAll(" ","");
        System.out.println(newS);
        char [] c =null;
        c = newS.toCharArray();
        for(int i=0; i<newS.length();i++){
            for(int j=i+1; j<newS.length() ;j++){
                char b= c[i];
                char d =c[j];
                if(b==d &&  d!=0){
                    c[j]=0;
                    count++;

                }
            }
        }

        for(int k=0; k<newS.length();k++){
            if(c[k]!=0){
                System.out.println(c[k]);
            }
        }
    }

    public void UseMap() {
        String string = "em den roi anh cuoi hahaha";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = string.toCharArray();
        Set<Character> keys = null;
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
            keys = map.keySet();
        }
        for (Character ch : keys) {
            if(map.get(ch)>1){
                System.out.println("Char "+ch +""+map.get(ch));
            }
        }
    }
}
