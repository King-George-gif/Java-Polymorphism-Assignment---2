package answer;

class StaffMember{
	protected String name, address, phone;
	
	StaffMember(String name, String address, String phone){
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String toString() {
		return null;
	}
	public double pay() {
		return 0;
	}
}

class Volunteer extends StaffMember{
	
	Volunteer(String name, String address, String phone){
		super(name, address, phone);
	}
	public double pay() {
		return 0;
	}
}

class Employee extends StaffMember{
	protected String socialSecurityNumber;
	protected double payRate;
	
	Employee(String name, String address, String phone, String socialSecurityNumber,double payRate){
		super(name, address, phone);
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
	}
	
	public String toString() {
		return null;
	}
	public double pay() {
		return 0;
	}
}

class Executive extends Employee{
	private double bonus;
	
	Executive(String name, String address, String phone, String socialSecurityNumber,double payRate){
		super(name, address, phone, socialSecurityNumber, payRate);
	}
	
	public void awardBonus(double execBonus) {
		this.bonus = execBonus;
	}
	public double pay() {
		return this.bonus;
	}
}

class Hourly extends Employee{
	private int hoursWorked;
	
	Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate){
		super(name, address, phone, socialSecurityNumber, payRate);	
	}
	
	public void addHours(int moreHours) {
		this.hoursWorked += moreHours;
	}
	public double pay() {
		double pay = (this.hoursWorked * this.payRate);
		return pay;
	}
	public String toString() {
		return "";
	}
}


class Commission extends Hourly{
	double totalSales = 0;
	double commissionRate;
	
	Commission(String name, String address, String phone, String socialSecurityNumber, double payRate, double commissionRate){
		super(name, address, phone, socialSecurityNumber, payRate);
		this.commissionRate = commissionRate;
	}
	
	public void addSales(double totalSales) {
		this.totalSales += totalSales;
	}
	
	public double pay() {
		return super.pay() + (this.totalSales*commissionRate);
	}
	
	public String toString() {
		return super.toString() + this.totalSales;
	}
}

class Staff{
	private StaffMember[] staffList;
	
	{
	staffList = new StaffMember[8];
	Commission tom = new Commission("Thomas Enchill", "AD-4564-333", "+233 245665343","SN321455", 6.25, 0.2);
	Commission ike = new Commission("Isaac Mahy", "WD-4564-333", "+233 298665343","SN323355", 9.75, 0.15);
	tom.addSales(400);
	tom.addHours(35);
	ike.addSales(950);
	ike.addHours(40);
	staffList[0] = tom;
	staffList[1] = ike;

	}
	
	
	
	
	public void payday() {
		
	}
}


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff one = new Staff();
		

	}

}
