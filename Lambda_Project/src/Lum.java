import java.util.Scanner;

public class Lum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MyInterface obj = (num)->{
			if(num%2 == 0) {
				return "Even number";
			}else {
				return "odd number";
			}
			
			
		};
		System.out.println("Enter the Number ");
		int a = in.nextInt();
		
		System.out.println(obj.oddNum(a));
		
	}

}
interface MyInterface{
	String oddNum(int a);
}
