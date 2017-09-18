package holaMundoCapas3;

public class DAOFactory{

	public static DAOInterface getDAO(){
		return new DAO();
	}
}
