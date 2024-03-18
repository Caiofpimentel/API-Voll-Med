package br.com.cpimentel.med.voll.api.domain.consulta.validacoes;

import br.com.cpimentel.med.voll.api.domain.ValidacaoException;
import br.com.cpimentel.med.voll.api.domain.consulta.ConsultaRepository;
import br.com.cpimentel.med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorMedicoComOutraConsultaNoMesmoHorario {

    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var medicoPossuiOutraConsultaNoMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if (medicoPossuiOutraConsultaNoMesmoHorario){
            throw new ValidacaoException("Médico já possui outra consulta agendada nesse mesmo horário");
        }
    }
}
