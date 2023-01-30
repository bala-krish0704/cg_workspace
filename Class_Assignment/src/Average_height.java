import java.util.Scanner;

public class Average_height {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the count of the student");
		int count = in.nextInt();
		int[] height = new int[count];
		System.out.println("Enter all the student height");
		int sum = 0 ;
		for(int i = 0 ; i < count ; i++) {
			height[i] = in.nextInt();
			sum+=height[i];
		}
		float avg = (sum/count);
		System.out.println("The average height of the student is - "+ avg);
	}

}
