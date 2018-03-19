package pais;

import java.sql.Connection;
import java.sql.PreparedStatement;          //id (int), nome (String), populacao (long) e area (double).
import java.sql.ResultSet;
import java.sql.SQLException;


@SuppressWarnings("unused")
public class PaisDAO {
	public void incluir(PaisTO to) {
		String sqlInsert = "INSER INTO pais(id, nome, populacao, area) VALUES(?, ?, ?)";
		try(Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);){
			stm.setInt(1, to.getId());
			stm.setString(2, to.getNome());
			stm.setLong(3, to.getPopulacao());
			stm.setDouble(4, to.getArea());
			stm.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}		
	}

 public void atualizar(PaisTO to) {
	 String sqlUpdate = "UPDATE pais SET nome=?, populacao=?, area=? WHERE id=?";
	 try(Connection conn = ConnectionFactory.obtemConexao();			
			 PreparedStatement stm = conn.prepareStatement(sqlUpdate);){
		 	stm.setString(1, to.getNome());
			stm.setLong(2, to.getPopulacao());
			stm.setDouble(3, to.getArea());
			stm.setInt(4, to.getId);
			stm.execute();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
 }
 public void excluir (PaisTO to) {
	 String sqlDelete = "DELETE FROM pais WHERE id=?";
	 try(Connection conn = ConnectionFactory.obtemConexao();
			 PreparedStatement stm = conn.prepareStatement(sqlDelete);){
		 stm.setId(1, to.getId());
		 stm.execute();
	 }catch (Exception e) {
		 e.printStackTrace();
	 }
 }
public PaisTO carregar(int id) {
	PaisTO to = new PaisTO();
	String sqlSelect = "SELECT nome, populacao FROM pais pais.id =?";
	try(Connection conn = ConnectionFactory.obtemConexao();
			PreparedStatement stm = conn.prepareStatement(sqlSelect);){
		stm.setInt(1, id);
		try(ResultSet rs = stm.executeQuery();){
			if(rs.next()) {
				to.setNome(rs.getString("nome"));
				to.setPopulacao(rs.getLong("populacao"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}catch(SQLException el ) {
		System.out.print(el.getStackTrace());
	}
return to;
	}
}