package lab04;
import java.util.ArrayList;
import  java.util.List;
import java.util.Iterator;

public class RosterTester{

	public static void main(String[] args){

		Roster testRost = new Roster();

		Student alex = new Student(1,"Alex");
		Student henry = new Student(2,"Henry");
		Student ed = new Student(3,"Ed");

		testRost.addStudent(alex);
		testRost.addStudent(ed);
		testRost.addStudent(henry);

		System.out.println(testRost);

		testRost.dropStudent("Alex");
		System.out.println(testRost);

		testRost.sortByID();
		System.out.println(testRost);

		for(Student e: testRost.getClassRoster()){
			System.out.println(e.getName() + " " + e.getID());
		}
	}

}
