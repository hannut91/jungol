package jungol;

import java.util.Scanner;

public class jung1809 {

	public static void main(String[] args) {
		int index = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long hi[] = new long[N];
		int sum[] = new int[N];
		for(index=0;index<N;index++){
			hi[index] = sc.nextLong();
		}
		for(index=N-1;index>0;index--){
			for(i=index-1;i>=0;i--){
				if(hi[index]<hi[(i)]) {sum[index]= i+1;
				break;
			}
			}
		}
		for(index =0; index<N;index++){
			System.out.print(sum[index]+" ");
		}
		
	}

}
