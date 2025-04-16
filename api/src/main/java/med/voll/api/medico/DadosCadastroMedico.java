package med.voll.api.medico;

import med.voll.api.endereco.Dados;

//Colocamos os campos que estão chegando da requisição, dentro dessa classe
public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, Dados endereco) {
}
