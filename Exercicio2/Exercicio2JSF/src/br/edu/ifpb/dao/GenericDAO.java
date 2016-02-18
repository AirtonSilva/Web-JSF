package br.edu.ifpb.dao;

import java.sql.*;

public class GenericDAO {
	
	static String user = "root";
	static String password = "senha";
	static String url = "jdbc:mysql://localhost:3306/bd_usuariojsf";
	static Connection connection;
	static ResultSet rs;

	public GenericDAO() {
		
	}
	
	public void abrirConexao(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, user, password);			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Não foi possível encontrar o Driver apropriado");
		} catch (SQLException sqle) {
			System.out.println("Não foi possível conectar ao SGBD");
			sqle.printStackTrace(System.err);
		}
		
	}
	
	public void alteraBanco(String sql){
		
		try{
			Statement st = this.connection.createStatement();
			st.executeUpdate(sql);
			st.close();
		
		} catch (SQLException sqle) {
			System.out.println("Não foi possível inserir usuário");
			sqle.printStackTrace(System.err);
		}
		
	}
	
	public ResultSet consultaBanco(String sql){
		
		try{
			Statement st = this.connection.createStatement();
			rs = st.executeQuery(sql);
		
		} catch (SQLException sqle) {
			System.out.println("Não foi possível fazer a consulta");
			sqle.printStackTrace(System.err);
		}
		
		return rs;
	}
	
	public void fecharConexao(){
		
		try {
			this.connection.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível fechar conexão");
			e.printStackTrace();
		} catch (NullPointerException npe){
			System.out.println("Não foi possível realizar inserção");
			npe.printStackTrace(System.err);
		}
	}
	
}