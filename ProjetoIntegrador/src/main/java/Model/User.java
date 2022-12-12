package Model;

public class User {
	
	private int IdUsuario;
	private String Nome;
	private String Telefone;
	private String Email;
	private int Senha;
	
	
	public int getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getSenha() {
		return Senha;
	}
	public void setSenha(int senha) {
		Senha = senha;
	}
	
	public User(int idUsuario, String nome, String telefone, String email, int senha) {
		super();
		IdUsuario = idUsuario;
		Nome = nome;
		Telefone = telefone;
		Email = email;
		Senha = senha;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
