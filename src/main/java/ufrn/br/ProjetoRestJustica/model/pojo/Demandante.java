package ufrn.br.ProjetoRestJustica.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.ProjetoRestJustica.model.enums.Vinculo;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Demandante extends AbstractEntity {

    @OneToOne
    @MapsId
    @JoinColumn(name = "pessoa_fisica_id")
    private PessoaFisica PessoaFisica;

    @Enumerated(EnumType.STRING)
    private Vinculo vinculo = Vinculo.CIDADÃO;


    @ManyToOne
    @JoinColumn(name = "doenca_id")
    private Doenca doenca;


}
