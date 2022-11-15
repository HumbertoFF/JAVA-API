package ufrn.br.ProjetoRestJustica.service;

import org.springframework.stereotype.Service;
import ufrn.br.ProjetoRestJustica.model.pojo.Doenca;
import ufrn.br.ProjetoRestJustica.repository.DoencaRepository;
import ufrn.br.ProjetoRestJustica.service.generic.AbstractService;

@Service
public class DoencaService  extends AbstractService<Doenca, DoencaRepository> {
    public DoencaService(DoencaRepository repository) {
        super(repository);
    }
}
