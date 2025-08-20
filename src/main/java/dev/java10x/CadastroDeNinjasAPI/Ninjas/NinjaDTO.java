package dev.java10x.CadastroDeNinjasAPI.Ninjas;
import dev.java10x.CadastroDeNinjasAPI.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String img_url;
    private MissoesModel missoes;
    private String rank;

}
