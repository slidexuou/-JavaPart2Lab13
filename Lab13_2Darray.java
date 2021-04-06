package com.xuou.Lab13;

public class Lab13_2Darray {
	public static void main(String[] args) {
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		for (int[] row : twoD_Array) {
			for (int element : row) {
				System.out.println(element);
			}
		}

	}

}

//class Loop2D{
//	public static void main(String[]args) {
//		int[][] tD_Array = {
//				{1,2,3},{4,5,6,7},{8,9}
//		};
//		for(int row = 0;row<tD_Array.length;row++) {
//			for(int element=0; element<tD_Array[row].length;element++) {
//				System.out.println(tD_Array[row][element]);
//			}
//		}
//	}
//}