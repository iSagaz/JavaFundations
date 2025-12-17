package com.example.lojaroupa.controler;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void CadastrarRoupa(@RequestBody String roupa){
        System.out.println(roupa);
    }
}

