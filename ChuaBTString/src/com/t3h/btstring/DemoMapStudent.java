package com.t3h.btstring;

import java.security.Key;
import java.util.*;

public class DemoMapStudent {
    private Map<String, Student> studentMap;

    public DemoMapStudent(){
        studentMap = new HashMap<>();
    }

    public void push(String identify, Student s){
        studentMap.put(identify, s);
    }

    public void printAll(){
        Set<String> keys = studentMap.keySet();
        Iterator<String> inters = keys.iterator();
        while (inters.hasNext()){
            String key = inters.next();
            studentMap.get(key).printInfo();
            inters.next();
        }

    }
}
