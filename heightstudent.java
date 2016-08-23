package m3logic;

import java.util.Scanner;

public class heightstudent {
	public static void main(String arg[]){
		
		int arr[]=new int[10];
		Scanner ff=new Scanner(System.in);
		for(int i=0;i<10;i++){
			arr[i]=ff.nextInt();
		}
		int kth;
		System.out.println("the kth student");
		kth=ff.nextInt();
	for(int j=0;j<10;j++){
		for(int k=j+1;k<10;k++){
			if(arr[j]>arr[k]){
				int tmp=arr[j];
				arr[j]=arr[k];
				arr[k]=tmp;
			}
		}
	}
	for(int h=(10-4);h>kth;h--){
	System.out.println("output"+arr[h]);
	
	}
	
	
	
	
	
	
	
	
	
	
	}
}
