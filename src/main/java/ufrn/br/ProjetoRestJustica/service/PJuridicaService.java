package ufrn.br.ProjetoRestJustica.service;

import org.springframework.stereotype.Service;
import ufrn.br.ProjetoRestJustica.model.pojo.PessoaJuridica;
import ufrn.br.ProjetoRestJustica.repository.PJuridicaRepository;
import ufrn.br.ProjetoRestJustica.service.generic.AbstractService;

@Service
public class PJuridicaService  extends AbstractService<PessoaJuridica, PJuridicaRepository> {
    public PJuridicaService(PJuridicaRepository repository) {
        super(repository);
    }
}
