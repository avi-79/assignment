package CoreJavaAssignmaent3;

public class TechnicalEmployee extends Emp{
String technicalskills;

public String getTechnicalskills() {
	return technicalskills;
}

public void setTechnicalskills(String technicalskills) {
	this.technicalskills = technicalskills;
}
public double calSal() {
	double HRA=basicpay*0.12;
	return basicpay +HRA;
}
	@Override
	public String toString() {
		return "TechnicalEmployee[technicalskills="+technicalskills+",employeeid="+employeeid+","
				+ "employeename="+employeename+","
			+ "address="+address+",basicpay="+basicpay+","
					+ "leaves="+leaves+"]";

}
}
