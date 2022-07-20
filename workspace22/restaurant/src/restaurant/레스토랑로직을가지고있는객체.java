package restaurant;

public class 레스토랑로직을가지고있는객체 {
	private RestaurantsDao dao;

	public 레스토랑로직을가지고있는객체() {}
	
	public 레스토랑로직을가지고있는객체(RestaurantsDao dao) {
		super();
		this.dao = dao;
	}

	public void setDao(RestaurantsDao dao) {
		this.dao = dao;
	}
	
	public void 로직1() {
		// 로직 흐름
		// dao.메소드호출();
	}
}
