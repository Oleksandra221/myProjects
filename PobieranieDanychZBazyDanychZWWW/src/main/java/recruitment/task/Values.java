package recruitment.task;



public class Values {
	private int id;
	private String column1;
	private String column2;
	private String column3;
	private int column4;
	private String column_names;
	
	public Values(int id, String column1, String column2, String column3, int column4, String column_names) {
		super();
		this.id = id;
		this.column1 = column1;
		this.column2 = column2;
		this.column3 = column3;
		this.column4 = column4;
		this.setColumn_names(column_names);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public String getColumn2() {
		return column2;
	}

	public void setColumn2(String column2) {
		this.column2 = column2;
	}

	public String getColumn3() {
		return column3;
	}

	public void setColumn3(String column3) {
		this.column3 = column3;
	}

	public int getColumn4() {
		return column4;
	}

	public void setColumn4(int column4) {
		this.column4 = column4;
	}

	public String getColumn_names() {
		return column_names;
	}

	public void setColumn_names(String column_names) {
		this.column_names = column_names;
	}
	
	
	
	
}
