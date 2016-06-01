package br.com.projeto.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.projeto.model.Cliente;
import br.com.projeto.model.Login;
import br.com.projeto.services.ClienteService;



@Controller
public class LoginController {
	
	@Autowired
	private ClienteService usuarioService;
	
	@RequestMapping(value={"/", "login"}, method=RequestMethod.GET)
	public String login(ModelMap map){
		map.addAttribute("login", new Login());
		return "login";
	}
	
	@RequestMapping(value="logar", method=RequestMethod.POST)
	public String logar(@Valid @ModelAttribute("login") Login login, BindingResult result, HttpSession sessao, ModelMap map){
		if(result.hasErrors()){
			return  "login";
		}
		
		Cliente usuarioBD = null;
		usuarioBD = usuarioService.procurarPorLoginSenha(login);

		if(usuarioBD == null){
			login.setSenha("");
			map.addAttribute("msg", "Nome de usuário ou senha errados. Por favor tente outra vez.");
			return  "login";
		}
//		Temporario, mudar pra tabela de permissões no futuro
		if(usuarioBD.getTipo().equals("Empresa")){
			sessao.setAttribute("home", "empresa");
		} else if (usuarioBD.getTipo().equals("Cliente")) {
			sessao.setAttribute("home", "cliente");
		}
//		Fim
		sessao.setAttribute("usuario", usuarioBD);
		return "redirect:/home";
	}
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String login(HttpSession session){
		session.invalidate();
		return "redirect:/login";
	}
}
