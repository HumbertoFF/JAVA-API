package ufrn.br.ProjetoRestJustica.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.ProjetoRestJustica.model.Acao;
import ufrn.br.ProjetoRestJustica.model.enums.Vinculo;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Servidor extends AbstractEntity {

    private int matricula;

    @OneToOne
    @MapsId
    @JoinColumn(name = "pessoa_fisica_id")
    private PessoaFisica PessoaFisica;

    @OneToMany(mappedBy = "atendente", fetch = FetchType.LAZY, orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<Acao> acao = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private Vinculo vinculo = Vinculo.ATENDENTE;

}
