package student;
import java.util.Scanner;
public class TestStudent {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int[] marks = new int[3];
		Student[] su = new Student[20];
		int size = 0;
		
		System.out.print("Enter id: ");
		int id = input.nextInt();
		System.out.print("Enter name: ");
		String name = input.next();
		System.out.print("Enter age: ");
		int age = input.nextInt();
		
		for(int i = 0; i < marks.length; i++) {
			System.out.print("Enter mark ["+ (i+1)  +"] : ");
		    marks[i] = input.nextInt();
		} 
		
		su[size] = new Student(id , age , marks , name);
		size++;
		
		for(int i=0 ; i < size; i ++) {
			
			su[i].setAverage(su[i].getAverage());
			su[i].setGreader(su[i].getGreader());
			System.out.println("Average = : " + su[i].getAverage());
			System.out.println("Greader   : " + su[i].getGreader());
		}
	}

}
