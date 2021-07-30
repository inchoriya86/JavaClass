package JDBC0721;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MB_SQL {
	// DB 접속을 위한 변수 선언
		Connection con = null;
		
		// DB로 쿼리문 전송을 위한 변수 선언
		Statement stmt = null;
		PreparedStatement pstmt = null;
		// PreparedStatement : ? 를 문자로 인식!
		
		
		// 조회(SELECT)의 결과를 저장하기 위한 변수 선언
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
