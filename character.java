import java.util.Scanner;
public class character{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	char ch = s.next().charAt(0);//nextInt()//nextLine()
	if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
		System.out.print("Alphabet");
	else if(ch>=48 && ch<=57)
		System.out.print("Digit");
	else
		System.out.print("Special character");
}
}