package ufrn.br.ProjetoRestJustica.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;
import ufrn.br.ProjetoRestJustica.controller.generic.AbstractController;
import ufrn.br.ProjetoRestJustica.model.pojo.PessoaFisica;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PfisicaDto extends RepresentationModel<PfisicaDto> {

    @NotBlank(message = "É necessário preencher o nome")
     String name;
    @Email(message = "e-mail não válido")
     String email;
    public PessoaFisica getEntity() {
        return new  PessoaFisica(this.name,this.email);

    }
    public void addLinks(PessoaFisica p){
        this.add(

                        linkTo(AbstractController.class)
                                .slash( p.getId())
                                .withSelfRel()

                );
        this.add(
                linkTo(AbstractController.class)
                        .slash( p.getId())
                        .withRel("delete")

        );
    }
}
