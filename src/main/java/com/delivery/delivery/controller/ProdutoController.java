package com.delivery.delivery.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.delivery.delivery.dao.ProdutoDAO;
import com.delivery.delivery.model.Produto;
import com.delivery.delivery.model.Tipo;
import com.delivery.delivery.repository.ProdutoRepository;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	private static ProdutoDAO dao = new ProdutoDAO();
	EntityManager em;  
	Session session;

	@Autowired
	private ProdutoRepository prodRepository;

	@RequestMapping(value = "teste", method = RequestMethod.GET)
	@ResponseBody
	public String teste() {
		Produto p = new Produto();
		p.setNome("Protudo novo");

		prodRepository.save(p);
		return "sucesso!";
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public Produto inserir(@RequestBody Produto produto) {
		System.out.println(">>>>>>Inserir produto<<<<<<<");
		prodRepository.save(produto);
		return produto;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	@ResponseBody
	Produto atualizar(@PathVariable long id, @RequestBody Produto produto) {
		//List<Produto> buscar = (List<Produto>) prodRepository.findAll();	
		//Optional<Produto> buscar = prodRepository.findById(id);
		
		//int cont = 0;				

//		for (Produto prod : buscar) {
//			if (prod.getId() == id) {
//				prod = produto;				
//				for (int cont = 0; cont < buscar.size(); cont++) {
//					if (buscar.get(cont).getId() == id & prod.toString()) {
//						buscar.set(cont, produto);
//						prodAtualizado = buscar.get(cont);
//						break;
//					}
//				}
//			}
//		}
//		//prodRepository.save(prodAtualizado);
//		return prodAtualizado;
		return null;
	}

	// @GetMapping("")
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarTodos() {
		List<Produto> produtos = (List<Produto>) prodRepository.findAll();
		return produtos;
	}

	@RequestMapping(value = "/tipos/{tipo}", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarPorTipo(@PathVariable Tipo tipo) {
		System.out.println(">>>>>>" + tipo);
		List<Produto> produto = prodRepository.findByTipo(tipo);
		return produto;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	Optional buscarUm(@PathVariable long id) {
		return prodRepository.findById(id);

	}

	// @DeleteMapping("{id}")
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String excluir(@PathVariable long id) {
		prodRepository.deleteById(id);
		return "Produto com id " + id + " excluído com sucesso";
	}

	///////////////////////////////////////
	@RequestMapping(value = "/batatas", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarTodasBatatas() {
		List<Produto> batatas = prodRepository.findByTipo(Tipo.BATATA);
		return batatas;
	}

	@RequestMapping(value = "/bebidas", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarTodasBebidas() {
		List<Produto> bebidas = prodRepository.findByTipo(Tipo.BEBIDA);
		return bebidas;
	}

	@RequestMapping(value = "/adicionais", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarTodosAdicionais() {

		List<Produto> adicionais = prodRepository.findByTipo(Tipo.ADICIONAL);
		return adicionais;
	}

}