package array;

import java.util.*;
//Alternating sum of an array 2+3-4+5-67

public class AlternatingSum {
	public static void main(String args[]){
		//Scanner object for input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int SIZE = sc.nextInt();
		int[] arr = new int[SIZE];
		int add=0,sub= 0;
		System.out.println("Enter the value of an index :-");
		//loop for taking an input
		for(int a=0;a<arr.length;a++) {
			arr[a]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				add+=arr[i];
			}else {
				sub+=arr[i]; 
			}
		}
		System.out.println(sub-add);
		

	}
	                        
}
