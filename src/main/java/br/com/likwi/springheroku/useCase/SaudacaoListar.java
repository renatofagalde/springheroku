package br.com.likwi.springheroku.useCase;


import br.com.likwi.springheroku.controller.record.SaudacaoResponse;

import java.util.List;

public interface SaudacaoListar {
    List<SaudacaoResponse> listar();
}
