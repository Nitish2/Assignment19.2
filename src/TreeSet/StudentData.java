package TreeSet;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentData { // Creating Class Student Data 

	public static void main(String[] args) { // Main Class
	    Set<Student> set=new TreeSet<Student>(); //Creating Tree set

		// Creating student data

		Student s1=(new Student("Nitish", 111, "Android"));
		Student s2=(new Student("Vishal", 101, "Java"));
		Student s3=(new Student("Nitish", 111, "Java")); // Duplicate element
		Student s4=(new Student("Zeenat", 112, "C++"));
		Student s5=(new Student("Appurav", 103, "Android"));
		Student s6=(new Student("Aamir", 104, "HTML"));
		Student s7=(new Student("Nitish", 111, "Java")); // Duplicate element
	  
		// Adding student data to treeSet
		 set.add(s1);
		 set.add(s2);
		 set.add(s3);
		 set.add(s4);
		 set.add(s5);
		 set.add(s6);
		 set.add(s7);

	
		 
		 Iterator<Student> t = set.iterator(); 

		while (t.hasNext()) { // Create loop to check the next line added in the hash set.
			Student student = (Student) t.next(); 

			System.out.println(student);   // Prints the result without duplicacy 
		}
	}

}
