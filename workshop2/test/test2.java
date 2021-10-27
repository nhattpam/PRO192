
/**
 *
 * @author meoca
 */
public class test2 {
        private String name;
	private int age;
	private String gender;
	private double gpa;

	public test2(String name, int age, String gender, double gpa) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.gpa = gpa;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("GPA: " + gpa);
	}
}
class Entry {
	public static void main(String[] args) {
		test2 s = new test2("Quang", 24, "Male", 7.7);
		s.display();
	}
}
