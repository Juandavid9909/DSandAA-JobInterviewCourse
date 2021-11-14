package com.ds.hash;

public class Entry {
	int key;
	Object value;
	Entry next;

	public Entry(int key, Object value) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public Entry() {
		next = null;
	}
	
	public int GetKey() {
		return this.key;
	}
	
	public Object GetValue() {
		return this.value;
	}
}