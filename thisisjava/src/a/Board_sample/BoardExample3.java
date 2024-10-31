package a.Board_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ch20.oracle.sec09.exam02.Board;

public class BoardExample3 {
	// field
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;

	// Constructor
	public BoardExample3() {
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");

			// 연결하기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "c##human", "human");
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}

	// method
	public void list () {
		// 타이틀 및 컬럼명 출력
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("---------------------------------------------------------------");
		
		// boards 테이블에서 게시물 정보를 가져와서 출력하기
		try {
			String sql = "" + 
					"SELECT bno, btitle, bcontent, bwriter, bdate " 
					+ "FROM boards "
					+ "ORDER BY bno DESC";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getString("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getString("bdate"));
				System.out.println("%-6s%-12s%-16s%-40s \n" , 
						board.getBno();
						board.getBwriter(),
						board,getBdate(),
						board,getBtitle());		
			}
			rs.close();
			pstmt.close();
			
		
		} catch ( SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		mainMenu();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
