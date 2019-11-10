package management;

public class Teachers {
	
	private Integer ID;
	private String dept;
	private String designation;
	private String name;
	
	public Integer getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Teachers(int iD, String dept, String designation, String name) {
		super();
		ID = iD;
		this.dept = dept;
		this.designation = designation;
		this.name = name;
	}
	
	
	

}
