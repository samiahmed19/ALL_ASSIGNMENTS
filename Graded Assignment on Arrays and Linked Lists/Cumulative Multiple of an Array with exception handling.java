// Question 1: Cumulative Multiple of an Array with exception handling

// Skill Mapping: Basic

// Description: Consider an Array with N number of integers.

// Task 1- WAP in Java to calculate cumulative multiple at each index.

// Task 2 – Push the result into the same Array and Print.

// Task 3 - Handle the exceptions in program

// Sample input: arrNum = [5, 3, 4, 2, 0, 8]

// Output:- arrNum = [5, 15, 60, 120, 0, 0]

// Explanation:- arrNum[0] -> C.M. = 5

// arrNum[1] -> C.M. = 5 x 3

// arrNum[2] -> C.M. = 5 x 3 x 4

// arrNum[3] -> C.M. = 5 x 3 x 4 x 2

// arrNum[4] -> C.M. = 5 x 3 x 4 x 2 x 0

// arrNum[5] -> C.M. = 5 x 3 x 4 x 2 x 0 x 8

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={5,3,4,2,0,8};
	    int prd=1;
	   // int k=0;
	    ArrayList<Integer> al=new ArrayList<>();
	    for(int i=0;i<arr.length;i++){
	        prd=arr[i]*prd;
	        al.add(prd);
	    }
	    System.out.print(al);
	}
}

