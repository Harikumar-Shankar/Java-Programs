package com.tester;
/**
* Search for an element in an array using Binary Search.
*
* @author Harikumar Shankar
* @version 1.0
* @since   2018-06-02 
*/
public class BinarySearch {

	private int binarySearch(int[] arr, int startingIndex, int lengthOfArray, int searchValue) {
		if (lengthOfArray >= startingIndex) {
			int middleNumber = (lengthOfArray - startingIndex) / 2;
			if (arr[middleNumber] == searchValue) {
				return middleNumber;
			}
			if (arr[middleNumber] > searchValue) {
				return binarySearch(arr, startingIndex, middleNumber, searchValue);
			}
			return binarySearch(arr, middleNumber, lengthOfArray, searchValue);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		// Input Array
		int arr[] = { 1, 2, 3, 8, 9 };
		// Search Number 8 in the array
		int index = bs.binarySearch(arr, 0, arr.length - 1, 8);
		// Index -1 will be returned only when there are no search element in the array
		if(index != -1){
			System.out.println("Result not found");
		} else{
			System.out.println("The search element is present in the index: " + index);
		}
		
	}

}
