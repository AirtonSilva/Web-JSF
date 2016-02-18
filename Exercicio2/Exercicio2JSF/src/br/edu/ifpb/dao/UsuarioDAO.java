package br.edu.ifpb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.edu.ifpb.entidade.Usuario;

public class UsuarioDAO {

	GenericDAO bd_usuariojsf = new GenericDAO();
	public ResultSet rs;

	public UsuarioDAO() {
	}

	public ArrayList<Usuario> consultaUser() {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		bd_usuariojsf.abrirConexao();
		System.out.print("Consulta SQL");

		String sql = "SELECT * FROM usuario";

		try {
			Statement st = GenericDAO.connection.createStatement();
			rs = st.executeQuery(sql);
			
			Usuario usuario = new Usuario();
			
			while(rs.next()) {
				usuario.setNome(rs.getString("nome"));
				usuario.setData_nascimento(rs.getString("data_nascimento"));
				usuario.setMatricula(rs.getString("matricula"));
				usuarios.add(usuario);
				System.out.println(" Sucesso");
			}
			st.close();

		}
		catch (SQLException sqle) {
			System.out.println(sqle.getMessage());
			sqle.printStackTrace(System.err);
		}
		catch (NullPointerException npe){
			System.out.println("Nao foi possivel realizar inserção");
			npe.printStackTrace(System.err);
		}

		bd_usuariojsf.fecharConexao();

		return usuarios;
	}

}