package br.com.cpimentel.med.voll.api.domain.consulta.validacoes;

import br.com.cpimentel.med.voll.api.domain.ValidacaoException;
import br.com.cpimentel.med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import br.com.cpimentel.med.voll.api.domain.paciente.PacienteRepository;

public class ValidadorPacienteAtivo {

    private PacienteRepository repository;
    public void validar(DadosAgendamentoConsulta dados){
        var pacienteEstaAtivo = repository.findaAtivoById(dados.idPaciente());
        if(!pacienteEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendada com paciente excluído");
        }
    }
}
