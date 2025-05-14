package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //indicando que essa classe é um controller do tipo rest
@RequestMapping("/medicos")
public class MedicoController {

    /*Recebendo os dados como STRING - dessa forma eles mostra todos os dados sem filtro*/
    //@PostMapping //Se chegar uma requisição via "post" o spring chamara o método cadastrar
    //public void cadastrar(@RequestBody String json){ //Com essa anotação o Spring recebe a requisição do json
    //    System.out.println(json);

    //}

    //Para o spring boot fazer o carregamento e a criação desse objeto automaticamente
    @Autowired
    private MedicoRepository repository;

    /*Recebendo os dados dentro de uma classe - Dessa forma conseguimos filtar oq queremos do JSON*/
    @PostMapping //Se chegar uma requisição via "post" o spring chamara o método cadastrar
    public void cadastrar(@RequestBody DadosCadastroMedico dados){ //Com essa anotação o Spring recebe a requisição do json, e como são alguns dados do cadastro médico recebemos eles dentro de uma classe
        //System.out.println(dados); -> Dessa forma so estavamos imprimindo o valor

        //Pegar o repository e cadastrar o medico no banco de dados
        repository.save(medico)

    }


}
