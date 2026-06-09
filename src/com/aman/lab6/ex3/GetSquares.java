package com.aman.lab6.ex3;
import java.util.*;

public class GetSquares {

	

	    public static Map<Integer,Integer> getSquares(int[] arr) {

	        Map<Integer,Integer> map = new HashMap<>();

	        for(int num : arr) {

	            map.put(num, num * num);
	        }

	        return map;
	    }

	    public static void main(String[] args) {

	        int arr[] = {2,3,4,5};

	        System.out.println(getSquares(arr));
	    
	}
}
