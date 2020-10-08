package day61_Maps;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>(); //random order
        Map<String, Integer> map2 = new TreeMap<>(); // sorted order
        Map<String, Integer> map3 = new LinkedHashMap<>(); //keep the insertion order it is
        Map<String, Integer> map4 = new Hashtable<>(); // synchornized version == Threadsafe
    }
}
