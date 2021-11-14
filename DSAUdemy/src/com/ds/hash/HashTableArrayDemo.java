package com.ds.hash;

public class HashTableArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableArray<String> hm = new HashTableArray<String>(10);
		
		hm.put(11, "hussein");
		hm.put(12, "Jena");
		hm.put(13, "Laya");
		
		System.out.println(hm.get(11));
	}
}