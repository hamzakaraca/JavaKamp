package �dev1;

public class Main {

	public static void main(String[] args) {
		Category category1=new Category("Programlama");
		Category[] category= {category1};
		for (Category ca : category) {
			System.out.println(ca.categoryName);
		}
		
		Course course1=new Course("Programlamaya Giri� ��in Temel Kurs","Engin Demiro�");
		Course course2=new Course("Yaz�l�m Geli�tirici Yeti�tirme C# Kamp�","Engin Demiro�");
		Course course3=new Course("Yaz�l�m Geli�tirici Yeti�tirme Java Kamp�","Engin Demiro�");
		Course[] course= {course1,course2,course3};
		
		for (Course co : course) {
			System.out.println(co.courseName +" "+ co.completionRate +" " + co.teacher);
		}
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.addCategory(category1);
		categoryManager.removeCategory(category1);
	}

}
