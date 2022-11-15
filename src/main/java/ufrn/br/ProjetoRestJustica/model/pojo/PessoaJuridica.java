package ufrn.br.ProjetoRestJustica.model.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;
import ufrn.br.ProjetoRestJustica.model.Acao;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PessoaJuridica extends AbstractEntity {

    private String name;
    private String cnpj;

    @OneToMany(mappedBy = "demandado", fetch = FetchType.LAZY, orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<Acao> acao = new ArrayList<>();

}
