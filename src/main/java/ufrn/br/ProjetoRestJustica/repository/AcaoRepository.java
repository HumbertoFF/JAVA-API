package ufrn.br.ProjetoRestJustica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.ProjetoRestJustica.model.Acao;

public interface AcaoRepository extends JpaRepository<Acao, Long> {
    public Acao findAcaoByProtocolo(String protocolo);
}
