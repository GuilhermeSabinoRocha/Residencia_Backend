package trabalhoBackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trabalhoBackend.repositorio.CategoriaRepo;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	//versao teste sabado
	
	@Autowired
	public CategoriaRepo Categoria;
	
	@GetMapping
	public List<Categoria> showAll()
	{
		return Categoria.findAll();
	}
	
	

}
