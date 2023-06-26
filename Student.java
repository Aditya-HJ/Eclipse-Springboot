package day17CollectionArrayList;

public class Student {
	String name;
	int age;
	boolean isMale;
	int mark;
	
	public Student(String name, int age, boolean isMale, int mark) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
		this.mark=mark;
		
	}

	public String toString() {
		return name+", "+age+", "+isMale+", "+mark;
	}
}
