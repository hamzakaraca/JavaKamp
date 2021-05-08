package ödev4;

public class Gamer {
		private int id;
		private String identityNumber;
		private String firstName;
		private String lastName;
		private String year;
		public Gamer(int id,String identityNumber, String firstName, String lastName, String year) {
			this.id = id;
			this.identityNumber=identityNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.year = year;
		}
		public String getIdentityNumber() {
			return identityNumber;
		}
		public void setIdentityNumber(String identityNumber) {
			this.identityNumber = identityNumber;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
}
