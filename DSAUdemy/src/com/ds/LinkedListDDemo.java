package com.ds;

public class LinkedListDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListD<String> ls = new LinkedListD<String>();
		
		ls.add("Hussein");
		ls.add("Jena");
		ls.add("Laya");
		ls.add("Waeel");
		System.out.println("before delete");
		ls.display();
		System.out.println("after delete");
		ls.delete();
		ls.display();
	}
}