package ufrn.br.ProjetoRestJustica.service;


import org.springframework.stereotype.Service;
import ufrn.br.ProjetoRestJustica.model.pojo.PessoaFisica;
import ufrn.br.ProjetoRestJustica.repository.PFisicaRepository;
import ufrn.br.ProjetoRestJustica.service.generic.AbstractService;
@Service
public class PFisicaService  extends AbstractService<PessoaFisica, PFisicaRepository> {
    public PFisicaService(PFisicaRepository repository) {
        super(repository);
    }
}
