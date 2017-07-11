package TreeSet;

public  class Student implements Comparable<Student>{ /** Student class .implements Comparable with three fields- name, rollNo and department
     **/

String name;  // String variable Name

int rollNo; // Integer Variable rollNo

String department; // String variable department

public Student(String name, int rollNo, String department) { // Main Method 
this.name = name; // this keyword is use to refer the current object of name 

this.rollNo = rollNo; // this keyword is use to refer the current object of rollNo

this.department = department; // this keyword is use to refer the current object of deparment
}
public String toString() { // toString Method
	return rollNo + " " + name + " " + department; // Return Type 
}                                                     
public int compareTo(Student s) { //Comparing strings
	if(rollNo>s.rollNo){    //Comparing by rollNo 
        return 1;  
    }else if(rollNo<s.rollNo){  
        return -1;  
    }else{  
    return 0;   // Return Type 
    }   
}
}

