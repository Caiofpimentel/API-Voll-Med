package br.com.cpimentel.med.voll.api.domain.medico;

import br.com.cpimentel.med.voll.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {


}
