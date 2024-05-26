package br.com.api.filme.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comédia"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crime");

    private String categoriaOmdb;
    private String categoriaPortugues;//para buscar por categoria

    Categoria(String categoriaOmdb, String categoriaPortugues) {

        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaPortugues;
    }

    public static Categoria fromString(String text) {
        for(Categoria categoria: Categoria.values()){
            if(categoria.categoriaOmdb.equals(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontada para a string fornecida");
    }

    public static Categoria fromBuscaPorGeneroPortugues(String text) {
        for(Categoria categoria: Categoria.values()){
            if(categoria.categoriaPortugues.equals(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontada para a string fornecida");
    }
}
