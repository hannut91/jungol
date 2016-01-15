package jungol;

import java.util.Scanner;

public class jung1328 {

	public static void main(String[] args) {
		int index=0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		int high[] = new int[N];
		for(index=0;index<N;index++){
			H[index] = sc.nextInt();
		}
		for(index=0;index<N;index++){
			for(i=index;i<N;i++){
				if(H[index]<H[i]){
					high[index]=i+1;
					break;
				}
			}
		}
		for(index=0;index<N;index++){
			System.out.println(high[index]);
		}
		return;
		
	}

}
