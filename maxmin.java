import java.util.*;
public class maxmin{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<n;i++){
		ar[i]=s.nextInt();
	}
	int min=ar[0],max=ar[0];
	for(int i:ar){
	if(i>max)max=i;
	if(i<min)min=i;
	}
	System.out.println("Maximun:"+max);
	System.out.print("Minimum:"+min);
	}
	}
	