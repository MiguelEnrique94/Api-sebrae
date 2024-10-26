package br.gov.sp.etec.VitalMotion.services.impl;

import br.gov.sp.etec.VitalMotion.dto.ProdutoDto;
import br.gov.sp.etec.VitalMotion.entity.ProdutoEntity;
import br.gov.sp.etec.VitalMotion.repository.CategoriaRepository;
import br.gov.sp.etec.VitalMotion.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    public List<ProdutoEntity> listaProdutos(){
        var retorno = produtoRepository.findAll();
        return retorno;
    }

    public ProdutoEntity salvaProduto(ProdutoDto produtoDto){
    	var idCategoria = Long.valueOf(produtoDto.getProductIdentifier());
    	var categoria = categoriaRepository.findById(idCategoria).get();		
    	var entity = convert(produtoDto, categoria);
        return produtoRepository.save(entity);
    }

    private ProdutoEntity convert(ProdutoDto produtoDto, ProdutoEntity categoriaEntity){
        var retorno = new ProdutoEntity();
        retorno.setNome(produtoDto.getNome());
        retorno.setDescricao(produtoDto.getDescricao());
        retorno.setPreco(produtoDto.getPreco());
        retorno.setCategoria(categoriaEntity);
        return retorno;

    }

}
