package recruitment.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ValuesDAO {
	String jdbcURL = "jdbc:postgresql://localhost/Values";
    String user = "postgres";
    String password = "DataBase20!2";
	
	public List<Values> getRowsFromValuesTable() throws SQLException{
		List<Values> rows_from_values_table = new ArrayList<Values>();
		try {
			Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance();
			Connection connection = DriverManager.getConnection(jdbcURL, user, password);

			if (connection!=null) {
				System.out.println("connected");
			}
			String sql_request = "SELECT * FROM Values";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql_request);
			//displayActor(result);
			while (result.next()) {
                int id = result.getInt("id");
                String column1 = result.getString("column1");
                String column2 = result.getString("column2");
                String column3 = result.getString("column3");
                int column4 = result.getInt("column4");
                String column_names = result.getString("column_names");
                
                Values one_row_from_values_table = new Values(id, column1, column2, column3, column4, column_names);
                     
                rows_from_values_table.add(one_row_from_values_table);
            }    
			
			//connection.close();
			
		} catch(Exception e){
			System.out.println("Error in connecting to PostgreSQL server");
			e.printStackTrace();
		}
		return rows_from_values_table;
	}
	
	private void displayActor(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getString("column_names"));

        }
    }

}
