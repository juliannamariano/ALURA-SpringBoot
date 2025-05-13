package med.voll.api.endereco;

//Como são muitos dados do endereço, criamos uma classe só para armazenar eles
//Utilizando o record não precisamos criar os getter  e setter, construtores...
public record DadosEndereco(String logadouro, String bairro, String cep, String cidade, String uf, String complemento, String numero) {
}
