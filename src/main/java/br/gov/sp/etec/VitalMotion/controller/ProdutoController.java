package br.gov.sp.etec.VitalMotion.controller;

import br.gov.sp.etec.VitalMotion.dto.ProdutoDto;
import br.gov.sp.etec.VitalMotion.services.impl.ProdutoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoServiceImpl produtoService;

    @GetMapping("produtos")
    public ResponseEntity<?> produtos(){
        var retorno = produtoService.listaProdutos();
        return ResponseEntity.ok(retorno);

    }
    
    @PostMapping("salvar-produto")
    public ResponseEntity<?> salvarProduto(@RequestBody ProdutoDto produtoDto){
    	
    	var retorno = produtoService.salvaProduto(produtoDto);
    	return ResponseEntity.ok(retorno);
    	
    }

}
