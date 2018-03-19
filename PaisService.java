package pais;


import dao.PaisDAO;
import model.Pais;

	public class PaisService {
	PaisDAO dao = new PaisDAO();
	
	public int incluir(Pais pais) {
		return dao.incluir(pais);
	}
	
	public void atualizar(Pais pais){
		dao.atualizar(pais);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Cliente carregar(int id){
		return dao.carregar(id);
	}

}
