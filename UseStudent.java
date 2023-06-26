package day17CollectionArrayList;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("ram",15,true,85);
		Student s2=new Student("Bala",16,true,90);
		Student s3=new Student("Sita",14,false,95);
		Student s4=new Student("Akash",16,true,75);
		Student s5=new Student("priya",13,false,65);
		Student s6=new Student("mala",15,false,78);
		Student s7=new Student("Sudarsan",16,true,83);
		
		ArrayList<Student> studentDetails=new ArrayList<>();
		studentDetails.add(s1);
		studentDetails.add(s2);
		studentDetails.add(s3);
		studentDetails.add(s4);
		studentDetails.add(s5);
		studentDetails.add(s6);
		studentDetails.add(s7);
		System.out.println("Total Students: "+studentDetails);
		
		ArrayList<Student> boyDetails=new ArrayList<>();
		ArrayList<Student> girlDetails=new ArrayList<>();
		for(Student s:studentDetails) {
			if(s.isMale==true) {
				boyDetails.add(s);
			}
			else {
				girlDetails.add(s);
			}
		}
		System.out.println("Boys: "+boyDetails);
		System.out.println("Girls: "+girlDetails);
		
	}
}
