package IFriendly;

import java.util.ArrayList;
import java.util.List;

public class MessManager {
    private List<Mess> mess;
    public void MessManager(List<Mess> mess){
        this.mess= new ArrayList<Mess>();
    }

    public void add(Mess m){
        mess.add(m);
    }

    public void remove(Mess m){
        mess.remove(m);
    }

    public void edit(Mess m){

    }
}

