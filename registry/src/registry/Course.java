package registry2;

public class Course {
	private String name; 
	private String neptun;
	private Student students[];
	private Teacher teacher;

	public Course(String na, String ne, int sn) {
		name = na; neptun = ne;
		students = new Student[sn]; // no Student is created!!!
	}

	public String getName() { return name; }
	public String getNeptun() { return neptun; }
	public void setTeacher(Teacher t) { teacher = t; }
	public void addStudent(Student s) throws CourseFullException { 
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = s;
				return;
			}
		}
		throw new CourseFullException(this, "Tele van");
	}

	public void listStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println(students[i]);
			}
		}
	}
	public void removeByNeptun(String neptun) throws NeptunNotFoundException { 
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) continue;
			String actNeptun = students[i].getNeptun();
			if (actNeptun.equals(neptun)) {
				students[i] = null;
				return;
			}
		}
		throw new NeptunNotFoundException(this, "Nincs ilyen");
	}
	public String toString() {
		return name+" ("+neptun+")";
	}
}  
