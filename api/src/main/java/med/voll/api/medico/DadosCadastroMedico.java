package med.voll.api.medico;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

//Colocamos os campos que estão chegando da requisição, dentro dessa classe
public record DadosCadastroMedico(
        /*COLOCANDO ANOTAÇÕES PARA O BEAN VALIDATION VALIDAR SE ESTÃO VINDO CORRETAS*/
        @NotBlank //verifica se não está vazio e se não esta nulo
        String nome,
        @NotBlank
        @Email //verifica se esta no formato de um email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
             @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull @Valid
        DadosEndereco endereco
) {
}
