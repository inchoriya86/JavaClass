package JDBCTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MB_SQL {
	
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 1.DB접속 메소드
	public void connect() {
		con = DBC.DBConnect();
	}

	// 2.DB접속해제 메소드
	public void conClose() {
		try {
			con.close();
			System.out.println("DB접속해제!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
