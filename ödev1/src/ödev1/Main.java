package ödev1;

public class Main {

	public static void main(String[] args) {
		Category category1=new Category("Programlama");
		Category[] category= {category1};
		for (Category ca : category) {
			System.out.println(ca.categoryName);
		}
		
		Course course1=new Course("Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiroð");
		Course course2=new Course("Yazýlým Geliþtirici Yetiþtirme C# Kampý","Engin Demiroð");
		Course course3=new Course("Yazýlým Geliþtirici Yetiþtirme Java Kampý","Engin Demiroð");
		Course[] course= {course1,course2,course3};
		
		for (Course co : course) {
			System.out.println(co.courseName +" "+ co.completionRate +" " + co.teacher);
		}
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.addCategory(category1);
		categoryManager.removeCategory(category1);
	}

}
