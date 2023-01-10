package kosta.oop3;

public class Main {

	public static void main(String[] args) {
		
		Dao dao1= new OracleDao();
		Dao dao2 = new MySQLDao();
		Dao dao4 = new Dao() {
			
			@Override
			public void insert() {
				// TODO Auto-generated method stub
				System.out.println("MsSQLDao 호출444444");
			}
		};
		BoardService service4 = new BoardService(dao4);
		BoardService service = new BoardService(dao1);
		BoardService service2 = new BoardService(dao2);
		BoardService service3 = new BoardService(new Dao() {
			
			@Override
			public void insert() {
				// TODO Auto-generated method stub
				System.out.println("MsSQLDao 호출3333333");
			}
		});
//		BoardService service3 = new BoardService(new Dao){// 이건 잘못된것.
//			
//			@Override
//			public void insert() {
//				System.out.println("MsSQLDao 호출");
//				
//			}
//		};
		
		service.insertBoard();
		service2.insertBoard();
		service3.insertBoard();
		service4.insertBoard();
		
	}

}
