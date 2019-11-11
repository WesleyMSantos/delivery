package com.delivery.delivery.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.delivery.delivery.dao.ProdutoDAO;
import com.delivery.delivery.model.Batata;
import com.delivery.delivery.model.Produto;

@Controller
public class ProdutoController {
	
	private static ProdutoDAO dao = new ProdutoDAO();

	@GetMapping("/batatas")
	@ResponseBody
	public List<Batata> buscarTodasBatatas() {

		List<Batata> batatas = dao.buscarBatatas();
		return batatas;
			
	}

	@GetMapping("/adicionais")
	@ResponseBody
	public List<Produto> buscarTodosAdicionais() {

		List<Produto> adicionais = dao.buscarTodosAdicionais();		
		return adicionais;
	}
	
	@GetMapping("/batatas/{id}")
	@ResponseBody
	Batata buscarUmaBatata(@PathVariable int id) {
		
		Batata umaBatata = dao.buscarBatata(id);
		return umaBatata;

	}
	
	@GetMapping("/batatas/excluir/{id}")
	@ResponseBody
	public String excluirBatata(@PathVariable int id) {
		dao.excluirBatata(id);
		//buscarUmaBatata(id);
		return "Batata com id " +id+ " excluída com sucesso";
	}

}