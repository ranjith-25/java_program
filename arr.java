import java.util.*;
public class arr{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<n;i++){
		ar[i]=s.nextInt();
	}
	int sum=0;
	float avg=0.0f;
	for(int i:ar){
	sum+=i;
	}
	avg=sum/ar.length;
	System.out.print("Sum is "+sum+" and Average is "+avg);
	}
	}