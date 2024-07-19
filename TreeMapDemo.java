package com.demo;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> lm = new TreeMap<Integer, String>();
		lm.put(1, "Sayali");
        lm.put(14, "ram");
        lm.put(6, "shaym");
        lm.put(7, null);
        lm.put(10, null);
        lm.put(null, null);
   //   lm.put(3, "sita");
   //     lm.put(8, null);
   //     lm.put(null, null);
   //  lm.put(null, null);
   // lm.put(11, "sita");
        System.out.println(lm);

	}

}
