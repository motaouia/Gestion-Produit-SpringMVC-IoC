package test;

import org.motaouia.pckgeproduct.dao.IProduitDao;
import org.motaouia.pckgeproduct.dao.ProduitDaoImpl;

public class MainAppDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProduitDao dao = new ProduitDaoImpl();
		((ProduitDaoImpl)dao).init();

	}

}
