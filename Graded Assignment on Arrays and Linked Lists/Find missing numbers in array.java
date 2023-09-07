// Question 2: Find missing numbers in array -

// Skill Mapping: Basic

// Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

// Sample input: arrNum = {1, 2, 4, 5, 6}

// Output: 3

// Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}

// Output: 4, 7, 9, 12, 13

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={1, 2, 3, 5, 6, 8, 10, 11, 14};
	    ArrayList<Integer> al=new ArrayList<>();
	    
	    int exp=arr[0];
	    for(int num: arr){
	        while(num != exp){
	            al.add(exp);
	            exp++;
	        }
	        exp++;
	    }
	    System.out.print(al);
	    
	}
}
