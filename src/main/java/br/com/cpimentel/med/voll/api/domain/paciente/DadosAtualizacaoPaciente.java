package br.com.cpimentel.med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import br.com.cpimentel.med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
