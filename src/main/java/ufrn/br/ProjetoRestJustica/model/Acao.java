package ufrn.br.ProjetoRestJustica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.ProjetoRestJustica.model.enums.StatusAcao;
import ufrn.br.ProjetoRestJustica.model.enums.TipoAcao;
import ufrn.br.ProjetoRestJustica.model.generic.AbstractEntity;
import ufrn.br.ProjetoRestJustica.model.pojo.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Acao  extends AbstractEntity {

    @Enumerated(EnumType.STRING)
    private TipoAcao tipo = null;


    @Enumerated(EnumType.STRING)
    private StatusAcao status = StatusAcao.NOVO;
    private String protocolo;
    private String descricao;
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @ManyToOne
    private PessoaFisica solicitante;
    public PessoaFisica getPessoaFisica(){
        return solicitante;
    }


    @ManyToOne
    private PessoaJuridica demandado;
    public PessoaJuridica getPessoaJuridica(){
        return demandado;
    }

    @ManyToOne
    private Servidor atendente;
    public Servidor getAtendente() {
        return atendente;
    }
}
