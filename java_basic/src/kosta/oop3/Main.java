package kosta.oop3;

public class Main {

	public static void main(String[] args) {
		
		Dao dao1= new OracleDao();
		Dao dao2 = new MySQLDao();
		
		
		BoardService service = new BoardService(dao1);
		
		service.insertBoard();

	}

}
