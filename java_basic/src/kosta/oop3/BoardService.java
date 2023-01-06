package kosta.oop3;

public class BoardService {
	// OracleDao -> insert()호출
	// MySQLDao -> insert() 호출
	private Dao dao;
	
	public BoardService() {}
	
	public BoardService(Dao dao) {
		super();
		this.dao = dao;
	}

	public void insertBoard() {
		dao.insert();
	}
}
