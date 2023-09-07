// Question 3: Find the count of singulars in array -

// Skill Mapping: Expert

// Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.

// Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}

// Output: Count of singular socks = 3

// Explanation : Socks Id - 10: total count 4 => Two pairs of socks - no singular left

// Socks Id - 20: total count 3 => One pair of socks - 1 singular left

// Socks Id - 30: total count 1 => No pair of socks - 1 singular left

// Socks Id - 50: total count 1 => No pair of socks - 1 singular left

// So, Total number of Singular socks = 3


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={10, 20, 20, 10, 10, 30, 50, 10, 20};
	    HashMap<Integer,Integer> map=new HashMap<>();
	    for(int i: arr){
	        map.put(i,map.getOrDefault(i,0)+1);
	       // System.out.println(map);
	    }
	   // System.out.println(map);
	    int count=0;
	    for(int i: map.values()){
	        if(i%2==1) count++;
	    }
	    System.out.println(count);
	} 
}
