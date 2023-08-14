package br.com.likwi.springheroku.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "saudacao")
public class Saudacao {

    @Id
    private Integer id;

    private String conteudo;
}
