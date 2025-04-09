package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //indicando que essa classe é um controller do tipo rest
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping //Se chegar uma requisição via "post" o spring chamara o método cadastrar
    public void cadastrar(@RequestBody String json){ //Com essa anotação o Spring recebe a requisição do json
        System.out.println(json);

    }



}
