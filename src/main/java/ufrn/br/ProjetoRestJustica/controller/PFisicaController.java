package ufrn.br.ProjetoRestJustica.controller;

import org.springframework.web.bind.annotation.*;
import ufrn.br.ProjetoRestJustica.controller.generic.AbstractController;
import ufrn.br.ProjetoRestJustica.model.pojo.PessoaFisica;
import ufrn.br.ProjetoRestJustica.service.PFisicaService;



@RestController
@RequestMapping("/pfisica")
public class PFisicaController extends AbstractController<PessoaFisica, PFisicaService> {

    public PFisicaController(PFisicaService service) {
        super(service);
    }
}
