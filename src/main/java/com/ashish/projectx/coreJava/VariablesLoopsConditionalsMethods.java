package com.ashish.projectx.coreJava;


import java.util.*;
import java.util.stream.Collectors;

public class VariablesLoopsConditionalsMethods {

    public static void main(String[] args){
        System.out.println("Size of Long on this machine:" + Byte.BYTES);
        List<String> lst = Arrays.asList("Ashish","Shashank","Ankit","Ashish", "Ranvijay");
        // Using Set to remove duplicates
        System.out.println(new LinkedHashSet<String>(lst).stream().collect(Collectors.toList()));
        // Using Stream operators to remove duplicates
        System.out.println(lst.stream().distinct().collect(Collectors.toList()));

        // More bruteforce way of doing the same thing. Removal of duplicates
        Map<String, Integer> map = new HashMap();
        lst.forEach(item -> {
         map.put(item,1);
        });
        System.out.println(Arrays.asList(map.keySet()).stream().
                flatMap(Collection::stream).collect(Collectors.toList()));
    }

}
