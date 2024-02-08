package Operations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Connection.GetConnection;

public class Implementation implements EmpOperations {

	@Override
	public void addEmp(Emp emp) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection()
					.prepareStatement("insert into emp(id,name,salary) values(?,?,?)");
			preparedStatement.setInt(1, emp.getId());
			preparedStatement.setString(2, emp.getName());
			preparedStatement.setDouble(3, emp.getSalary());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateEmp(Emp emp) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection()
					.prepareStatement("update emp set name=?,salary=? where id=?");

			preparedStatement.setString(1, emp.getName());
			preparedStatement.setDouble(2, emp.getSalary());
			preparedStatement.setInt(3, emp.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmp(Emp emp) {
		try {
			PreparedStatement preparedStatement;
			preparedStatement = GetConnection.getConnection().prepareStatement("delete from emp where id=?");
			preparedStatement.setInt(1, emp.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String[] searchEmp(Emp emp) {
		PreparedStatement preparedStatement = null;
		String[] data = new String[3];

		try {
			preparedStatement = GetConnection.getConnection().prepareStatement("select * from emp where id =?");
			preparedStatement.setInt(1, emp.getId());
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				data[0] = resultSet.getString(1);
				data[1] = resultSet.getString(2);
				data[2] = resultSet.getString(3);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

	@Override
	public List<String[]> showEmp() {
		List<String[]> data = new ArrayList<String[]>();
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = GetConnection.getConnection().prepareStatement("select * from emp");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String[] row = new String[3];
				row[0] = resultSet.getString(1);
				row[1] = resultSet.getString(2);
				row[3] = resultSet.getString(3);
				data.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}

}
