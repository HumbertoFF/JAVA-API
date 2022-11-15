package ufrn.br.ProjetoRestJustica.controller;
import org.springframework.web.bind.annotation.*;
import ufrn.br.ProjetoRestJustica.controller.dto.AcaoDto;
import ufrn.br.ProjetoRestJustica.controller.generic.AbstractController;
import ufrn.br.ProjetoRestJustica.model.Acao;
import ufrn.br.ProjetoRestJustica.service.AcaoService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/acao")
public class AcaoController extends AbstractController<Acao, AcaoService> {
    public AcaoController(AcaoService service) {
        super(service);
    }

    public List<AcaoDto> converter(List<Acao> acao){
        return acao.stream().map(AcaoDto::new).collect(Collectors.toList());
    }

}
