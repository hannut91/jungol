package jungol;

import java.util.Scanner;

public class jung1972 {

	public static void main(String[] args) {
		int index = 0;
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int C = sc.nextInt();
		long data[] = new long[N];
		for(index=0;index<N;index++){
			data[index] = sc.nextLong();
		}
		quickSort(data, 0,N-1);
		if(C==0){
			for(index=0;index<N;index++){
				System.out.println(data[index]);
			}
		}
		else{
			for(index=N-1;index>=0;index--){
				System.out.println(data[index]);
			}
		}
		
	}
	static int partition(long arr[], int left, int right){
	      int i = left, j = right;
	      long tmp;
	      long pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	static void quickSort(long arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
		
	


}
