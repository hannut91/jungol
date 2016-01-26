package jungol;

import java.util.Scanner;

public class jung1240 {

	public static void main(String[] args) {
		int index = 0;
		int i=0;
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long h[] = new long[(int)N];
		long temp = N;
		long sum = 0;
		long total = 1;
		index = 2;
		while(true){
			if(temp%index==0){
				h[index-1]++;
				temp= temp/index;
			}else{
				index++;
			}
			
			if(temp ==1){
				break;
			}
		}
		for(index=0;index<N;index++){
			for(i=0;i<h[index]/2;i++){
				total*=(index+1);
			}

		}
		System.out.print(total);
		
		
		
		
	}

}
