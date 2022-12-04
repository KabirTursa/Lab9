package org.example;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Student implements Serializable, Comparable, Cloneable {
	private double GPA;
	private String name;
	
	public Student(String n, double gpa) {
		name = n;
		GPA = gpa;
	}

	public Student(Student other) {
		GPA = other.getGPA();
		name = other.getName();
	}
	@Override
	public Student clone() {
		return new Student(this);
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObjectToFile();
		Student a = readObjectFromFile();
		
		if(a != null) {
			System.out.println(a.toString());
		}
	}

	private static Student readObjectFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.obj"));
		Student one = (Student) is.readObject();
	
		is.close();
		
		return one;
	}

	private static void writeObjectToFile() throws FileNotFoundException, IOException {
		Student nguyen = new Student("Nguyen", 3.5);

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.obj"));
		os.writeObject(nguyen);
			
		os.close();		
	}

	/*
	Positive if THIS is greater than parameter
	Returns difference in GPA truncated to an int UNLESS difference is between 1 and -1
	In that case, it will return 1 or -1 respectively
	This is to ensure that a return value of 0 will always mean equal GPAs
	The compareTo method in the Comparable interface returns an int
	This is why I am forced to return an int here instead of a double
	*/
	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Student)) {
			return Integer.MAX_VALUE;
		}
		Student other = (Student) o;
		double difference = GPA - other.GPA;
		if (difference > 0) {
			if (difference > 1) {
				return (int) difference;
			} else {
				return 1;
			}
		} else if (difference < 0) {
			if (difference < -1) {
				return (int) difference;
			} else {
				return -1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nGPA: " + GPA;
	}
}
