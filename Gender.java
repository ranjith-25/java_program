import java.util.Scanner;
public class Gender{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	String str = args[0];
	int age=Integer.parseInt(args[1]);
	if(str.equals("female")){
		if(age>=1 && age<=58)
			System.out.print("Percentage of interest is 8.2%");
		else if(age>=59 && age<=100)
			System.out.print("Percentage of interest is 9.2%");
	}
	else{
		if(age>=1 && age<=58)
			System.out.print("Percentage of interest is 8.4%");
		else if(age>=59 && age<=100)
			System.out.print("Percentage of interest is 10.5%");
	}
	
}
}