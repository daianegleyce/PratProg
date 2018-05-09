package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pais;
import service.PaisService;


@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pNome = null;
		long pPopulacao = 0;
		double pArea = 0.0;
		String pAcao = request.getParameter("acao");
		int id = -1;

		Pais pais = new Pais();
		
		PaisService ps = new PaisService();
		RequestDispatcher view = null;
		
		
		if (pAcao.equals("Criar")) {
			pNome = request.getParameter("nome");
			pPopulacao = Long.parseLong(request.getParameter("populacao"));
			pArea = Double.parseDouble(request.getParameter("area"));
			pais.setId(id);
			pais.setNome(pNome);
			pais.setPopulacao(pPopulacao);
			pais.setArea(pArea);
			ps.criar(pais);
			ArrayList<Pais> lista = new ArrayList<>();
			lista.add(pais);
			HttpSession session = request.getSession();
			session.setAttribute("lista", lista);
			view = request.getRequestDispatcher("ListarPaises.jsp");
			
		} else if (pAcao.equals("Excluir")) {
			String pId = request.getParameter("id");
			ps.excluir(pais.getId());
			HttpSession session = request.getSession();
			ArrayList<Pais> lista = (ArrayList<Pais>)session.getAttribute("lista");
			lista.remove(busca(pais, lista));
			session.setAttribute("lista", lista);
			view = request.getRequestDispatcher("ListarPaises.jsp");	
			
		} else if (pAcao.equals("Alterar")) {
			String pId = request.getParameter("id");
			id = Integer.parseInt(pId);
			pNome = request.getParameter("nome");
			pPopulacao = Long.parseLong(request.getParameter("populacao"));
			pArea = Double.parseDouble(request.getParameter("area"));
			pais.setId(id);
			pais.setNome(pNome);
			pais.setPopulacao(pPopulacao);
			pais.setArea(pArea);
			ps.atualizar(pais);
			HttpSession session = request.getSession();
			ArrayList<Pais> lista = (ArrayList<Pais>)session.getAttribute("lista");
			int pos = busca(pais, lista);
			lista.remove(pos);
			lista.add(pos, pais);
			session.setAttribute("lista", lista);
			request.setAttribute("pais", pais);
			view = request.getRequestDispatcher("VisualizarPais.jsp");	
			
		} else if (pAcao.equals("Visualizar")) {
			String pId = request.getParameter("id");
			id = Integer.parseInt(pId);
			pais.setId(id);
			HttpSession session = request.getSession();
			pais = ps.carregar(pais.getId());
			request.setAttribute("pais", pais);
			view = request.getRequestDispatcher("VisualizarPais.jsp");
			
		} else if (pAcao.equals("Editar")) {
			pais = ps.carregar(pais.getId());
			request.setAttribute("pais", pais);
			view = request.getRequestDispatcher("AlterarPais.jsp");		
		}
		
		view.forward(request, response);

	}

	public int busca(Pais pais, ArrayList<Pais> lista) {
		Pais to;
		for(int i = 0; i < lista.size(); i++){
			to = lista.get(i);
			if(to.getId() == pais.getId()){
				return i;
			}
		}
		return -1;
	}

}