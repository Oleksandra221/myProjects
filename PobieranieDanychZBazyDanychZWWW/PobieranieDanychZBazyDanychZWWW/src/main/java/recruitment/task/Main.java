package recruitment.task;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValuesDAO test = new ValuesDAO();
		try {
			test.getRowsFromValuesTable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
