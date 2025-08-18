package dev.java10x.CadastroDeNinjasAPI.Ninjas;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String falandoOla(){
        return "olá mundo";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado!";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public String mostrarNinja(){
        return "Mostrar Ninja";
    }

    // mostrar ninjas Por Id (READ)
    @GetMapping("listarID")
    public String mostrarNinjasPorID(){
        return "Mostrar Ninja por ID!";
    }

    // alterar dados dos ninjas por ID(UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar por id";
    }

    // Deletar Ninja por ID(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por id";
    }



}
