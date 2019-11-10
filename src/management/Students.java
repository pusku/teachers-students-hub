package management;

public class Students {

	private Integer ID;
	private Integer batch;
	private String name;
	private String dept;
	
	public Students(Integer id, Integer batch, String name, String dept) {
		this.ID = id;
		this.batch = batch;
		this.name = name;
		this.dept = dept;
	}
	
	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getBatch() {
		return batch;
	}

	public void setBatch(Integer batch) {
		this.batch = batch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	public Students() {
		// TODO Auto-generated constructor stub
	}

}
