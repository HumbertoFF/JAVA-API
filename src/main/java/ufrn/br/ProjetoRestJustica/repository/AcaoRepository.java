package ufrn.br.ProjetoRestJustica.repository;
import ufrn.br.ProjetoRestJustica.model.Acao;
import ufrn.br.ProjetoRestJustica.repository.generic.GenericRepository;

public interface AcaoRepository extends GenericRepository<Acao> {
    public Acao findAcaoByProtocolo(String protocolo);
}
