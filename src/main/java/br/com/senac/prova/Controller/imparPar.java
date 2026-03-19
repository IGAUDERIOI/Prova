package br.com.senac.prova.Controller;

import br.com.senac.prova.Dto.parDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prova")
@CrossOrigin
public class imparPar {

    @GetMapping("/validarNumero")
    public ResponseEntity<parDto> validarNumero(@RequestParam double numero) {
        String imparPar = "";
        double restoDivisao = numero / 2;

        if (numero % 2 == 0) {
            imparPar = ("Par");
        }else if (numero % 3 == 0) {
            imparPar = ("Impar");
        }
        return ResponseEntity.ok(new parDto(imparPar, restoDivisao));
    }
}
