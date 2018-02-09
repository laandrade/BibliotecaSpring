package br.biblioteca.livros.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {
//	@Autowired
//	private LivroRepository livroRepository;

	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

//	@GetMapping("/livros")
//	public ModelAndView livros() {
//		Iterable<Livro> livros = livroRepository.findAll();
//		return new ModelAndView("livros", "livros", livros);
//	}

}