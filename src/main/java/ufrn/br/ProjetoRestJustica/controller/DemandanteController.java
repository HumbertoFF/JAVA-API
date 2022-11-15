package ufrn.br.ProjetoRestJustica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.ProjetoRestJustica.controller.generic.AbstractController;
import ufrn.br.ProjetoRestJustica.model.pojo.Demandante;
import ufrn.br.ProjetoRestJustica.service.DemandanteService;

@RestController
@RequestMapping("/demandante")
public class DemandanteController extends AbstractController<Demandante, DemandanteService> {

    public DemandanteController(DemandanteService service) {
        super(service);
    }
}