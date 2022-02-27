package me.dio.web.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo, descricao;

    public abstract double calcularXP();

}
