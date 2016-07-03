package br.com.administradora.condonager.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.administradora.condonager.model.Proprietario;

@Controller
public class ProprietarioController {

	@RequestMapping("/proprietario/novo")
	public String novo(Model model){
		model.addAttribute(new Proprietario());
		return "proprietario/CadastroProprietario";
	}
	
	@RequestMapping(value = "/proprietario/novo", method = RequestMethod.POST)
	public String cadastrar( @Valid Proprietario proprietario , BindingResult result, Model model, RedirectAttributes attributes ){
		if(result.hasErrors()){
			System.out.println(">>>>> erro ao cadastrar   ");
		}
		attributes.addFlashAttribute("mensagem", "cadastro efetuado com sucesso");
		System.out.println(">>>>> cadastrar >>>>>   "   + proprietario.getSku());
		return "redirect:/proprietario/novo";
		        
	}
	
}
