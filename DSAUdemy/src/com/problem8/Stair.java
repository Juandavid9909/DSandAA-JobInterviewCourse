package com.problem8;

import java.util.ArrayList;

public class Stair {
	public int number;
	public ArrayList<Integer> visited = new ArrayList<Integer>();
	
	public Stair(int number, ArrayList<Integer> visited) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.visited.addAll(visited);
		this.visited.add(this.number);
	}
}