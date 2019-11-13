package com.delivery.delivery.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.delivery.delivery.dao.ProdutoDAO;
import com.delivery.delivery.model.Batata;
import com.delivery.delivery.model.Bebida;
import com.delivery.delivery.model.Produto;
import com.delivery.delivery.model.Tipo;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	private static ProdutoDAO dao = new ProdutoDAO();

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public Produto inserirProduto(@RequestBody Produto produto) {
		System.out.println(">>>>>>Inserir produto<<<<<<<");
		produto = dao.inserir(produto);
		return produto;
		 		
	}
	
	@RequestMapping(value = "{id}" , method = RequestMethod.PUT)
    @ResponseBody
    Produto atualizarProduto(@PathVariable int id, @RequestBody Produto produto) {
    	return dao.atualizarProduto(id, produto);
    }
	
	@RequestMapping(value = "/tipos/{tipo}", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarPorTipo(@PathVariable Tipo tipo) {
		System.out.println(">>>>>>"+tipo);
		List<Produto> tipos = dao.buscarPorTipo(tipo);
		
		return tipos;
			
	}
	
	
	//@GetMapping("")
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarTodosProdutos() {

		List<Produto> produtos = dao.buscarTodos();
		return produtos;
			
	}
	
	@RequestMapping(value = "/batatas", method = RequestMethod.GET)
	@ResponseBody
	public List<Batata> buscarTodasBatatas() {

		List<Batata> batatas = dao.buscarBatatas();
		return batatas;
			
	}
	
	@RequestMapping(value = "/bebidas", method = RequestMethod.GET)
	@ResponseBody
	public List<Bebida> buscarTodasBebidas() {

		List<Bebida> bebidas = dao.buscarBebidas();
		return bebidas;
			
	}

	@RequestMapping(value = "/adicionais", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarTodosAdicionais() {

		List<Produto> adicionais = dao.buscarTodosAdicionais();		
		return adicionais;
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	Batata buscarUmaBatata(@PathVariable int id) {
		
		Batata umaBatata = dao.buscarBatata(id);
		return umaBatata;

	}
	
	//@DeleteMapping("{id}")
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String excluirBatata(@PathVariable int id) {
		dao.excluirBatata(id);		
		return "Batata com id " +id+ " excluída com sucesso";
	}

}