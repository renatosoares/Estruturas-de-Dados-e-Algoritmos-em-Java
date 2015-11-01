package projetoOrientadoObjeto;

public class Student implements Person {
	String id;
	String name;
	int age;

	public Student(String i, String n, int a) { // Construtor simples
		id = i;
		name = n;
		age = a;
	}

	protected int studyHours() {
		return age / 2;
	} // apenas um palpite

	public String getID() {
		return id;
	} // ID do estudate

	public String getName() {
		return name;
	} // da interface Person 

	public int getAge() {
		return age;
	} // da interface Person

	public boolean equalTo(Person other) { // da interface Person
		Student otherStudent = (Student) other; // cast Person to Student
		return (id.equals(otherStudent.getID())); // compare IDs
	}

	public String toString() { // for printing
		return "Student(ID: " + id + ", Name: " + name + ", Age: " + age + ")";
	}
}
