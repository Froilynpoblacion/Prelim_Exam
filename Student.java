
public class Student {
	
	public int IDnumber;
	public int credit;
	public int points;
	
	public Student (int IDnumber,int credit,int points) {
		
		this.IDnumber = IDnumber;
		this.credit = credit;
		this.points = credit;
		
	}
	
	
	public int getIDnumber() {
		return IDnumber;
	}
	
	public int getcredit() {
		return credit;
	}
	
	public int getIpoints() {
		return points;
	}
	
}