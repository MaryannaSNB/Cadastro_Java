package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexao.Conexaoo;

public class UserDao{
	
	Connection con;
	ResultSet rs;
	
	public UserDao() {
		
		con = new Conexaoo(). conectar();		
		
	}
	
	public void Salvar(User use) {

		try {	
			String sql = "insert into user (nome,telefone,email,senha) values (?,?,?,?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, use.getNome());
			stmt.setString(2, use.getTelefone());
			stmt.setString(3, use.getEmail());
			stmt.setInt(4, use.getSenha());
			stmt.executeUpdate();
			//con.close();
			
		}
		catch(SQLException erro) {
			
			System.out.println(erro);
			
		}
		
	}
	
	public void BuscaUse(User use) {
		try {
			String sql = "select * from user where idusuario=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, use.getIdUsuario());
			rs = stmt.executeQuery();
			while(rs.next()) {
				use.setIdUsuario(rs.getInt(1));
				use.setNome(rs.getString(2));
				use.setTelefone(rs.getString(3));
				use.setEmail(rs.getString(4));
				use.setSenha(rs.getInt(5));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	
	public ArrayList<User>listar(){
		
		try {
			
			String sql = "select * from user";
			ArrayList<User> users = new ArrayList<>();
			PreparedStatement stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				int idusuario = rs.getInt(1);
				String nome = rs.getString(2);
				String telefone = rs.getString(3);
				String email = rs.getString(4);
				int senha = rs.getInt(5);
				users.add(new User(idusuario,nome,telefone,email,senha));
				
			}
			
			return users;
			
		}catch(SQLException erro) {
			
			System.out.println(erro);
			return null;
			
		}
		
	}
	
public void Editar(User use) {
		
		try {
			
			String sql = "update user set nome=?,telefone=?,email=?,senha=? where idusuario=?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, use.getNome());
			stmt.setString(2, use.getTelefone());
			stmt.setString(3, use.getEmail());
			stmt.setInt(4, use.getSenha());
			stmt.setInt(5, use.getIdUsuario());
			stmt.executeUpdate();
			//con.close();			
			
		}
		catch(SQLException erro) {
			System.out.println(erro);
		}
		
	}
	
public void Excluir(User use) {
	
	try {
		
		String sql = "delete from user where idusuario=?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setInt(1, use.getIdUsuario());
		stmt.executeUpdate();
		//con.close();			
		
	}
	catch(SQLException erro) {
		System.out.println(erro);
	}
	
}
}