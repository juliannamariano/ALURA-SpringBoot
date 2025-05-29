package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController //indicando que essa classe é um controller do tipo rest
@RequestMapping("/medicos")
public class MedicoController {

    /*Recebendo os dados como STRING - dessa forma eles mostra todos os dados sem filtro*/
    //@PostMapping //Se chegar uma requisição via "post" o spring chamara o método cadastrar
    //public void cadastrar(@RequestBody String json){ //Com essa anotação o Spring recebe a requisição do json
    //    System.out.println(json);

    //}

    //Para o spring boot fazer o carregamento e a criação desse objeto automaticamente - Injeção de dependencias
    @Autowired
    private MedicoRepository repository;

    /*Recebendo os dados dentro de uma classe - Dessa forma conseguimos filtar oq queremos do JSON*/
    @PostMapping //Se chegar uma requisição via "post" o spring chamara o método cadastrar - Postar o medico
    @Transactional //essa anotação  faz a transação ativa com o banco de dados
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){ //anotação: "Request body" o Spring recebe a requisição do json, e como são alguns dados do cadastro médico recebemos eles dentro de uma classe
        //anotação @Valid faz com que o spring use as validações que colocamos cm as anotações
        //System.out.println(dados); -> Dessa forma so estavamos imprimindo o valor
        //Pegar o repository e cadastrar o medico no banco de dados
        repository.save(new Medico(dados));//como a classe recebe a variavel dados vamos transformar o objeto medico para receber esses dados

    }

    /*CRIANDO LISTAGEM DOS MÉDICOS*/
    @GetMapping //qual metodo será chamado atraves do http - Estamos devolvendo a informação
    public List <DadosListagemMedico> listar(){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList(); //o metodo findAll devolve a lista \ Precisamos converter de medico para dados
    }


}
