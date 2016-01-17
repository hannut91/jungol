package jungol;

import java.util.Scanner;

public class jung1214 {

	public static void main(String[] args) {
		int index = 0;
		int i = 0;
		long max = 0;
		long low = 1;
		long high = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long hi[] = new long[n];
		for(index=0;index<n;index++){
			hi[index] = sc.nextInt();
		}
		for(index=0;index<n;index++){
			if(hi[index]!=0){
				low = 1;
				high = hi[index];
				if(max<(low*high))max = low*high;
				for(i=index+1;i<n;i++){
					if(hi[i]==0){
						break;
					}
					else if(hi[i]>=high){
						low = (i-index)+1;
						if(max<(low*high)) max = low*high;
					}
					else if(hi[i]<high){
						low = (i-index)+1;
						high = hi[i];
						if(max<(low*high)) max = low*high;
					}
					
				}
			}
		}
		System.out.print(max);
		
	}

}
