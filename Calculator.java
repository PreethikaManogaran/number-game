import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Calculator {
	public static void main(String[] args) {
		int n,total = 0;
                float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of subjects");
		n = sc.nextInt();
		List<Integer> array = new ArrayList<Integer>();
		System.out.println("Enter the marks : ");
		for (int i = 0; i < n; i++) {
			array.add(sc.nextInt());
			total += array.get(i);
		}
		avg = total / n;
		if (avg > 90)
			System.out.println("Your grade is S");
		else if ((avg > 80) && (avg <= 90))
			System.out.println("Your grade is A");
		else if ((avg > 70) && (avg <= 80))
			System.out.println("Your grade is B");
		else if ((avg > 60) && (avg <= 70))
			System.out.println("Your grade is C");
		else if ((avg > 50) && (avg <= 60))
			System.out.println("Your grade is D");
		else if ((avg > 40) && (avg <= 50))
			System.out.println("Your grade is E");
		else
			System.out.println("Your grade is F");
	}
}