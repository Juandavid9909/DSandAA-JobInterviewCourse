package com.problem8;

import java.util.ArrayList;
import java.util.Stack;

public class StairCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int step = 4;
		Stack<Stair> stairStack = new Stack<Stair>();
		stairStack.add(new Stair(0, new ArrayList<Integer>()));
		
		while(!stairStack.isEmpty()) {
			Stair currentStair = stairStack.pop();
			
			if(currentStair.number == step) {
				System.out.println(currentStair.visited);
				continue;
			}
			
			int oneStair = currentStair.number + 1;
			
			if(oneStair <= step) {
				stairStack.add(new Stair(oneStair, currentStair.visited));
			}
		}
	}
}