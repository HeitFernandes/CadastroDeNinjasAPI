package dev.java10x.CadastroDeNinjasAPI.Missoes;


import dev.java10x.CadastroDeNinjasAPI.Ninjas.NinjaModel;
import dev.java10x.CadastroDeNinjasAPI.Ninjas.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Criar missao
    public MissoesModel criarMissao(MissoesModel missoes){
        return missoesRepository.save(missoes);
    }

    // Listar todas as missoes
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    //listar missoes por id
    public MissoesModel listarMissoesPorID(Long id){
        Optional<MissoesModel> missaoPorId = missoesRepository.findById(id);
        return missaoPorId.orElse(null);
    }

    //Deletar missoes
    public void deletarMissaoPorID(Long id){
        missoesRepository.deleteById(id);
    }

    //Mudar missao
    public MissoesModel atualizarMissoes(Long id, MissoesModel missaoAtualizada){
        if(missoesRepository.existsById(id)){
            missaoAtualizada.setId(id);
            return missoesRepository.save(missaoAtualizada);
        }
        return null;
    }


}
