import java.util.Scanner;


public class sqrenum {
public static void main(String arg[]){
	int happy;
	int a,a1,b,b1,sum=0,sume=0,ae,ae1,sum1;
	System.out.println("happy num is ");
	Scanner ff=new Scanner(System.in);
	happy=ff.nextInt();
	while(happy!=1){
		
		a=happy/10;
		if(a>=10){
			ae=a%10;
			ae1=ae*ae;
			sume=sume+ae1;
			a=a/10;
		}
		a1=a*a;
		b=happy%10;
		b1=b*b;
		
		sum=sume+a1+b1;
		System.out.println(sum);
		if(sum>=100){
			sum1=sum/10;
			System.out.println(sum1);
		}
		happy=sum;
		
	
	}
	
}
}
