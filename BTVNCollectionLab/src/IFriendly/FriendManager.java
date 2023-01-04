package IFriendly;

import java.util.ArrayList;
import java.util.List;

public class FriendManager {
    private List<Friend> friend;

    public FriendManager(List<Friend> friend) {
        this.friend = new ArrayList<Friend>();
    }

    public void add(Friend f){
        friend.add(f);
    }

    public void remove(Friend f){
        friend.remove(f);
    }

    public void edit(Friend f){

    }

    public void search(Friend f){

    }
}
