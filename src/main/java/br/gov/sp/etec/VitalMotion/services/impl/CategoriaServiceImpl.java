package br.gov.sp.etec.VitalMotion.services.impl;

import br.gov.sp.etec.VitalMotion.entity.CategoriaEntity;
import br.gov.sp.etec.VitalMotion.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl {

    @Autowired
    CategoriaRepository categoriaRepository;

    public List<CategoriaEntity> getCategorias() {
    return getCategorias();
    }
}

