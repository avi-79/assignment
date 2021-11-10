package CoreJavaAssignmaent3;

public class Address extends Emp{
		int Dno;
		String street;
		String city;
		int pincode;
		public int getDno() {
			return Dno;
		}
		public void setDno(int dno) {
			Dno = dno;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		@Override
		public String toString() {
		return "Address[dno="+ Dno +" , street="+street+",city=" +city+",pincode="+pincode+"]";
		}

}
