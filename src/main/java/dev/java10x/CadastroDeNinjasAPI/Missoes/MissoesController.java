package dev.java10x.CadastroDeNinjasAPI.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // GET - MANDAR UMA REQUISICAO PARA MOSTRAR AS MISSOES
    @GetMapping("/listar")
    public String listarMissao(){
        return "missoes listadas com sucesso";
    }

    // POST - MANDAR UMA REQUISiCAO PARA CRIAR AS MISSOES
    @PostMapping("/criar")
    public String criarMissao(){
        return "missao criada com sucesso";
    }

    // PUT - Mudar a missao, ou algum dado
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "missao alterada com sucesso";
    }

    // Delete para apagar missoes
    @DeleteMapping("/alterar")
    public String deletarMissao(){
        return "missao deletada com sucesso";
    }




}
