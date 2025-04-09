//Pacote que recebe as requisições tanto do back-end quanto do front
package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Para informar que essa classe é um controller colocamos essa anotação (Ele é uma classe "RestController"*/
@RestController
@RequestMapping("/hello") //Nessa anotação indica qual URL que nós vamos responder
public class HelloController {

    /*Essa anotação indica de qual método HTTP que ele está respondendo*/
    @GetMapping  //Toda vez que for chamado o método "get" vai voltar esse método abaixo
    public String olaMundo(){
        return "Hello Julianna";
    }


}
