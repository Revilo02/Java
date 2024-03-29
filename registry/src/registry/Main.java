package registry;

public class Main {
	static public void main(String[] args) {
		// 1. pelda
		Student s1 = new Student("Gipsz Jakab", "1A2B3C", 1996);
		Student s2 = new Student("Nagy K�roly", "XXX111", 1998);
		Student s3 = new Student("Kis Pippin", "111XXX", 1999);

		s1.addMark(4, 2);

		Teacher t1 = new Teacher("Rend Elek", "Q1W2E3", 1973);
		Teacher t2 = new Teacher("Csirke B�la", "OKTAT6", 1980);

		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(t1); 
		System.out.println(t2);

		// 2. pelda 
		Course c = new Course("Zabhegyez�s", "BMEVIIIZZ00", 5);
		Teacher t = new Teacher("Vastagh B�la", "VSTGBL", 1975);
		c.setTeacher(t);

		try {
		c.addStudent(new Student("Lutz Ern�", "LTZRN0", 1997));
		c.addStudent(new Student("Sz�ke Barna", "BRN123", 1997));
		c.addStudent(new Student("Hervadt Vir�g", "HRVDTV", 1998));
		c.addStudent(s3);
		}catch( Exception e) {
			 System.err.println(e.getMessage());
			  e.printStackTrace();

		}	
		try {
			c.addStudent(s3);
		}catch( Exception e) {
			 System.err.println(e.getMessage());
			  e.printStackTrace();

		}	
		c.listStudents();

		try {
		c.removeByNeptun("BRN123");
		c.removeByNeptun("BREKO");
		c.removeByNeptun("BREKO");
		c.removeByNeptun("BREKO");
		c.removeByNeptun("BREKO");

		}catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		c.listStudents();

	}
}
