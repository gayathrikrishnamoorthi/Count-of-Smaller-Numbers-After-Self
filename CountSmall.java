package sample;

import java.util.Scanner;

public class CountSmall {
	static void Arr(int arr[], int Small[], int a) {
		 for(int i = 0; i<a; i++) {
			 Small[i] = 0;
			 for(int j = i+1; j<a; j++) {
				 if(arr[j]<arr[i])
					 Small[i]++;
					 
			 }
		 }
	 }
	 static void Arr(int arr[], int size) {
		 System.out.println(Arrays.toString(arr));
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int b = arr.length;
		int c[] = new int[b];
		CountSmall.Arr(arr, c, b);
		CountSmall.Arr(c, b);
		
		

	}

}


