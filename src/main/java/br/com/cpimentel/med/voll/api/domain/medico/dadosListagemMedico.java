package br.com.cpimentel.med.voll.api.domain.medico;

public record dadosListagemMedico(Long id, String nome, String email, String crm, Especialidade especialidade) {

    public dadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
