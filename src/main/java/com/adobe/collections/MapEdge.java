package com.adobe.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEdge {


    public  static void main (String args[]){
        Map<String,Integer> map= new HashMap<>();
        map.put("ThisMap",2);
        //if the map does not have key
        if(!map.containsKey("abc")){
            System.out.println("this is map");
        }
        if(map.get("abc")==null){
            System.out.println("this map does not have key");
        }
        for(Map.Entry<String,Integer>entrySet:map.entrySet()){
            System.out.println(entrySet.getKey());
            System.out.println(entrySet.getValue());
        }

    }
}
