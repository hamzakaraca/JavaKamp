package ödev4;

public class Campaign {
	private int id;
	private String name;
	private String detail;
	private String validitydate;
		public Campaign(int id, String name, String detail, String validitydate) {
			this.id = id;
			this.name = name;
			this.detail = detail;
			this.validitydate = validitydate;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getValiditydate() {
			return validitydate;
		}
		public void setValiditydate(String validitydate) {
			this.validitydate = validitydate;
		}
}
