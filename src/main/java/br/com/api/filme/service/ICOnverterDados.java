package br.com.api.filme.service;

public interface ICOnverterDados {
    <T> T  obterDados(String json, Class<T> classe);
}
