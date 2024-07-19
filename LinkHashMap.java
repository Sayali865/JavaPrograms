package com.demo;

import java.util.LinkedHashMap;

public class LinkHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(1,"Sayali");
		lhm.put(2,"Sita");
		lhm.put(3,"gita");
		lhm.put(4,"null");
		lhm.put(null, null);
		lhm.put(null,"abc");
		System.out.println(lhm);

	}

}
