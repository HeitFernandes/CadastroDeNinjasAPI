package dev.java10x.CadastroDeNinjasAPI.Ninjas;


import dev.java10x.CadastroDeNinjasAPI.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity para tornar essa classe em uma entidade no banco de dados
@Entity
@Table(name = "tb_cadastro") // Table == name == nomeando a tabela
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "img_url")
    private String img_url;

    @ManyToOne // == Um ninja tem uma unica missao
    @JoinColumn(name = "missoes_id")
     private MissoesModel missoes;

}
