package dev.java10x.CadastroDeNinjasAPI.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // GET - MANDAR UMA REQUISICAO PARA MOSTRAR AS MISSOES
    @GetMapping("/listar")
    public List<MissoesModel> listarMissao(){
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id){
        return missoesService.listarMissoesPorID(id);
    }

    // POST - MANDAR UMA REQUISiCAO PARA CRIAR AS MISSOES
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missoes){
        return missoesService.criarMissao(missoes);
    }

    // PUT - Mudar a missao, ou algum dado
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "missao alterada com sucesso";
    }

    // Delete para apagar missoes
    @DeleteMapping("/deletarID/{id}")
    public void deletarMissaoPorId(@PathVariable Long id){
        missoesService.deletarMissaoPorID(id);
    }





}
