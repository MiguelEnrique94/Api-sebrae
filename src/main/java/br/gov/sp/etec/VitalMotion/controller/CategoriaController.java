package br.gov.sp.etec.VitalMotion.controller;

import br.gov.sp.etec.VitalMotion.entity.CategoriaEntity;
import br.gov.sp.etec.VitalMotion.services.impl.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    CategoriaServiceImpl categoriaService;

    public ResponseEntity<?> getCategorias() {
        List<CategoriaEntity> categorias = categoriaService.getCategorias();
        return ResponseEntity.ok(categorias);

    }
}
