package ufrn.br.ProjetoRestJustica.service;

import org.springframework.stereotype.Service;
import ufrn.br.ProjetoRestJustica.model.pojo.Demandante;
import ufrn.br.ProjetoRestJustica.repository.DemandanteRepository;
import ufrn.br.ProjetoRestJustica.service.generic.AbstractService;
@Service
public class DemandanteService   extends AbstractService<Demandante, DemandanteRepository> {
    public DemandanteService(DemandanteRepository repository) {
        super(repository);
    }
}
