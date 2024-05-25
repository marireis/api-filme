package br.com.api.filme.model;

public enum Categoria {
    ACAO("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        for(Categoria categoria: Categoria.values()){
            if(categoria.categoriaOmdb.equals(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontada para a string fornecida");
    }
}
