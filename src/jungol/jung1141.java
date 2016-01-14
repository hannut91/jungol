package jungol;

import java.util.Scanner;

public class jung1141 {

	public static void main(String[] args) {
		int index = 0;
		int i=0;
		int sum =0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int hi[] = new int[N];
		for(index =0;index<N;index++){
			hi[index] = sc.nextInt();
		}
		for(index=0;index<N;index++){
			for(i=index;i<N;i++){
				if(i+1<N && hi[index]>hi[i+1]) sum++;
				else break;
			}
		}
		System.out.println(sum);
		
	}

}
