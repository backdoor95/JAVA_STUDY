
public class MyBase extends Base {
	
	public MyBase() {}


	@Override
	public void day() {
		
		System.out.println("낮에는 열심히 일하자.");
	}

	@Override
	public void night() {
		
		super.night();
	}
	@Override
	public void service(String state) {
		
		if(state.equals("낮")) {
			day();
		}else if(state.equals("밤")){
			night();
		}else {
			afternoon();
		}
	}


	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
	
	
	
}
