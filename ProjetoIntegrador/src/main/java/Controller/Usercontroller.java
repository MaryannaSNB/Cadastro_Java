package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Conexao.Conexaoo;
import Model.User;
import Model.UserDao;

/**
 * Servlet implementation class Usercontroller
 */
@WebServlet(urlPatterns = {"/Usercontroller","/novouser","/buscauser","/selecionaruser","/editaruser","/excluiruser"})
public class Usercontroller extends HttpServlet {
	
	User use = new User();
	
	Conexaoo cone = new Conexaoo();
	
	UserDao dao = new UserDao();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getServletPath();
		
		if(action.equals("/novouser")) {
			BuscaDados(request,response);
		}else if(action.equals("/buscauser")) {
			ListaDados(request,response);
		}else if(action.equals("/selecionaruser")) {
			mostrarUser(request,response);
		}else if(action.equals("/editaruser")) {
			EditarUser(request,response);
		}else if(action.equals("/excluiruser")) {
			ExcluirUser(request,response);
		}
		
	}
	
protected void BuscaDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		use.setIdUsuario(Integer.parseInt(request.getParameter("idusuario")));
		use.setNome(request.getParameter("nome"));
		use.setTelefone(request.getParameter("telefone"));
		use.setEmail(request.getParameter("email"));
		use.setSenha(Integer.parseInt(request.getParameter("senha")));
		
		System.out.println(use.getIdUsuario()+use.getNome()+use.getTelefone()+use.getEmail()+use.getSenha());
		
	   dao.Salvar(use);
		
		
	}
	
	protected void ListaDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   ArrayList<User> lista = dao.listar(); 
	               request.setAttribute("users", lista);   
	               RequestDispatcher rd = request.getRequestDispatcher("Lista.jsp");
	               rd.forward(request, response);
	
	}
	
	protected void mostrarUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int idusuario = Integer.parseInt(request.getParameter("idusuario"));
		use.setIdUsuario(idusuario);
		dao.BuscaUse(use);
		
		request.setAttribute("idusuario", use.getIdUsuario());
		request.setAttribute("nome", use.getNome());
		request.setAttribute("telefone", use.getTelefone());
		request.setAttribute("email", use.getEmail());
		request.setAttribute("senha", use.getSenha());
		
		RequestDispatcher rd = request.getRequestDispatcher("Editar.jsp");
		rd.forward(request, response);
		
	}
	
	protected void EditarUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int idusuario = Integer.parseInt(request.getParameter("idusuario"));
		int senha = Integer.parseInt(request.getParameter("senha"));
		
		use.setIdUsuario(idusuario);
		use.setNome(request.getParameter("nome"));
		use.setTelefone(request.getParameter("telefone"));
		use.setEmail(request.getParameter("email"));
		use.setSenha(senha);
		
		dao.Editar(use);
		response.sendRedirect("principal.jsp");
		
	}
	
	protected void ExcluirUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int idusuario = Integer.parseInt(request.getParameter("idusuario"));
		use.setIdUsuario(idusuario);
		 dao.Excluir(use);
		 response.sendRedirect("principal.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
