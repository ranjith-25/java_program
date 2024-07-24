public class printAll{
public static void main(String args[]){
	int n=args.length;
	if(n!=0){
	for(int i=0;i<n;i++){
		System.out.print(args[i]);
		if(i!=n-1)System.out.print(",");
	}
	}
	else
	System.out.print("No Values");
}
}