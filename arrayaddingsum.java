package guvi;

import java.util.Scanner;

public class arrayaddingsum {
	public static void main(String arg[]){
		int arr1[]=new int[6];

		int arr[]=new int[6];
		Scanner ff=new Scanner(System.in);
		for(int i=0;i<6;i++){
			arr[i]=ff.nextInt();
		}
		int kth;
		System.out.println("the kth student");
		kth=ff.nextInt();
	for(int j=0;j<6;j++){
		for(int k=0;k<6;k++){
			if(j!=k){
				if(kth==arr[j]+arr[k]){
					System.out.println(arr[j]+" "+arr[k]);
				}
			}
		}
	}
	
	
	
	
	}
}
