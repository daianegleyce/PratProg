package service;

import java.util.ArrayList;

import dao.PaisDAO;
import model.Pais;

public class VendedorService {
	PaisDAO dao;
	
	public VendedorService(){
		dao = new PaisDAO();
	}
	public ArrayList<Pais> listarPaises(){
		return dao.listarPaises();
	}
	public ArrayList<Pais> listarPaises(String chave){
		return dao.listarPaises(chave);
	}
}