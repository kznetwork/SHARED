package com.samsung;

//public class Largest {
//	public static int largest(int[] list) {
//		int index, max = Integer.MAX_VALUE;
//
//		for ( index = 0; index < list.length - 1; index++ ) {
//			if ( list[index] > max ) {
//				max = list[index];
//			}
//		}
//
//		return max;
//	}
//}


public class Largest {
	public static int largest(int[] list) {
		int index, max = Integer.MIN_VALUE;

		if ( list.length == 0 ) {
			throw new RuntimeException("Empty List");
		}

		for ( index = 0; index < list.length; index++ ) {
			if ( list[index] > max ) {
				max = list[index];
			}
		}
		return max;
	}
}
