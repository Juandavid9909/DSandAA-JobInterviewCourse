package com.problem18;

import java.util.ArrayList;

public class SpiralMatrix {

	public SpiralMatrix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		
		ArrayList <Integer> listElementsSpiral = new SpiralMatrix().printSpiral(array);
		
		for(Integer element : listElementsSpiral) {
			System.out.println(element);
		}
	}
	
	ArrayList<Integer> printSpiral(int[][] array) {
		ArrayList<Integer> spiralList = new ArrayList<Integer>();
		
		int firstRow = 0;
		int lastRow = array.length - 1;
		int firstCol = 0;
		int lastCol = array[0].length - 1;
		
		while(firstRow < lastRow && firstCol < lastCol) {
			// Up
			for(int i = firstCol; i < lastCol; i++) {
				spiralList.add(array[firstRow][i]);
			}
			
			for(int i = firstRow; i <= lastRow; i++) {
				spiralList.add(array[i][lastCol]);
			}
			
			for(int i = lastCol - 1; i >= firstCol; i--) {
				spiralList.add(array[lastRow][i]);
			}
			
			for(int i = lastRow - 1; i > firstRow; i--) {
				spiralList.add(array[i][firstCol]);
			}
			
			firstRow++;
			lastRow--;
			firstCol++;
			lastCol--;
		}
		
		return spiralList;
	}
}