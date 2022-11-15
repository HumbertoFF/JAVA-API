package ufrn.br.ProjetoRestJustica.service;

import org.springframework.stereotype.Service;
import ufrn.br.ProjetoRestJustica.model.Acao;
import ufrn.br.ProjetoRestJustica.repository.AcaoRepository;
import ufrn.br.ProjetoRestJustica.service.generic.AbstractService;

@Service
public class AcaoService extends AbstractService<Acao, AcaoRepository> {
    public AcaoService(AcaoRepository repository) {
        super(repository);
    }

}
