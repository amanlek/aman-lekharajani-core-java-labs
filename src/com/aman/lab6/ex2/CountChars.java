package com.aman.lab6.ex2;
import java.util.*;

public class CountChars {
	

	    public static Map<Character, Integer> countChars(char[] arr) {

	        Map<Character, Integer> map = new HashMap<>();

	        for(char ch : arr) {

	            if(map.containsKey(ch))
	                map.put(ch, map.get(ch) + 1);
	            else
	                map.put(ch, 1);
	        }

	        return map;
	    }

	    public static void main(String[] args) {

	        char[] arr = {'a','b','a','c','b','a'};

	        System.out.println(countChars(arr));
	    }
	}

