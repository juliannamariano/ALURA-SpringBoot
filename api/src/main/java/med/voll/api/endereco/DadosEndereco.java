package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

//Como são muitos dados do endereço, criamos uma classe só para armazenar eles
//Utilizando o record não precisamos criar os getter  e setter, construtores...
public record DadosEndereco(
        @NotBlank
        String logadouro,
        @NotBlank
        String bairro,
        @NotBlank @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        String complemento,
        String numero
) {
}
