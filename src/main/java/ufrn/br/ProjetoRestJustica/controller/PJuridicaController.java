package ufrn.br.ProjetoRestJustica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.ProjetoRestJustica.controller.generic.AbstractController;
import ufrn.br.ProjetoRestJustica.model.pojo.PessoaJuridica;
import ufrn.br.ProjetoRestJustica.service.PJuridicaService;

@RestController
@RequestMapping("/pjuridica")
public class PJuridicaController extends AbstractController<PessoaJuridica, PJuridicaService> {

    public PJuridicaController(PJuridicaService service) {
        super(service);
    }
}
