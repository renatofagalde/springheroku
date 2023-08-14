package br.com.likwi.springheroku.service;


import br.com.likwi.springheroku.controller.record.SaudacaoResponse;
import br.com.likwi.springheroku.domain.Saudacao;
import br.com.likwi.springheroku.repository.SaudacaoRepository;
import br.com.likwi.springheroku.useCase.SaudacaoListar;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SaudacaoService implements SaudacaoListar {

    private final SaudacaoRepository saudacaoRepository;

    public SaudacaoService(SaudacaoRepository saudacaoRepository) {
        this.saudacaoRepository = saudacaoRepository;
    }

    @Override
    public List<SaudacaoResponse> listar() {
        List<SaudacaoResponse> saudacoes = this.saudacaoRepository.findAll()
                .stream()
                .map(toSaudacaoResponse())
                .collect(Collectors.toList());

        return saudacoes;

    }

    private static Function<Saudacao, SaudacaoResponse> toSaudacaoResponse() {
        return objeto -> new SaudacaoResponse(objeto.getId(),objeto.getConteudo());
    }
}
