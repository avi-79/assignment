package CoreJavaAssignmaent3;

public class Staff extends Emp {
	String title;

	public String getStaff() {
		return title;
	}

	public void setStaff(String staff) {
		this.title = staff;
	}
	public double calSal() {
		double HRA=basicpay*0.18;
		return basicpay +HRA;
	}
		@Override
		public String toString() {
			return "staff[title="+title+",employeeid="+employeeid+","
					+ "employeename="+employeename+","
				+ "address="+address+",basicpay="+basicpay+","
						+ "leaves="+leaves+"]";
			
		}
}
