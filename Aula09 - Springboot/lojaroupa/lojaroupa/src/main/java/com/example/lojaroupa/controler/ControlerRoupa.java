package com.example.lojaroupa.controler;

import com.example.lojaroupa.model.DadosRoupa;
import com.example.lojaroupa.model.Roupa;
import com.example.lojaroupa.model.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// controler responsavel por receber as requisicoes em http
// rest - API rest

//Funcionamento do REST
// Metodo get - busca dados
// metodo post - criar dados
// metodo put - atualizar dados
// metodo delete = excluir dados

@RestController
// definir a url do controler
// nosso controler tera o seguinte endpoint
// http: //localhost:8080/roupas
@RequestMapping("roupas")
@CrossOrigin(origins = "*")
public class ControlerRoupa {
    @Autowired
    private RoupaRepository roupaRepository;

    @PostMapping
    public void CadastrarRoupa(@RequestBody DadosRoupa dadosRoupa){
        roupaRepository.save(new Roupa(dadosRoupa));
    }

    @GetMapping
    public List<Roupa> listar(){
        return roupaRepository.findAll();
    }
}

