package br.com.cpimentel.med.voll.api.domain.consulta.validacoes;

import br.com.cpimentel.med.voll.api.domain.ValidacaoException;
import br.com.cpimentel.med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import br.com.cpimentel.med.voll.api.domain.medico.MedicoRepository;


public class ValidadorMedicoAtivo {
    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        //escolha do medico opcional
        if (dados.idMedico() == null){
            return;
        }
        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());
        if(!medicoEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendada com médico inativo");
        }
    }

}
