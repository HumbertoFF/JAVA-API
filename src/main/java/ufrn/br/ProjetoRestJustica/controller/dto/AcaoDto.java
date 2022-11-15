package ufrn.br.ProjetoRestJustica.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.ProjetoRestJustica.model.Acao;
import ufrn.br.ProjetoRestJustica.model.enums.StatusAcao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcaoDto {

    private StatusAcao status = StatusAcao.NOVO;
    private String tipoacao;
    private String descricao;
    private LocalDateTime dataCriacao;
    public AcaoDto(Acao acao) {
        this.tipoacao = String.valueOf(acao.getTipo());
        this.descricao = acao.getDescricao();
        this.dataCriacao = acao.getDataCriacao();
    }
    public StatusAcao getStatus() {
        return status;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getTipoacao() {
        return tipoacao;
    }
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    public static List<AcaoDto> converter(List<Acao> acao){
        return acao.stream().map(AcaoDto::new).collect(Collectors.toList());
    }
}
