package br.com.likwi.springheroku.controller;

import br.com.likwi.springheroku.controller.record.SaudacaoResponse;
import br.com.likwi.springheroku.useCase.SaudacaoListar;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaudacaoController {

    private final SaudacaoListar saudacaoListar;

    public SaudacaoController(SaudacaoListar saudacaoListar) {
        this.saudacaoListar = saudacaoListar;
    }

    @GetMapping("/saudacao")
    public ResponseEntity<List<SaudacaoResponse>> saudacoes() {

        List<SaudacaoResponse> listar = this.saudacaoListar.listar();

        return ResponseEntity.status(HttpStatus.OK)
                .body(listar);

    }
}
