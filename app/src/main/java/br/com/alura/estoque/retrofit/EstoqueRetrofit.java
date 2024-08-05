package br.com.alura.estoque.retrofit;

import br.com.alura.estoque.retrofit.service.ProdutoService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EstoqueRetrofit {

    private final ProdutoService produtoService;

    public EstoqueRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://172.26.32.1:8081/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        produtoService = retrofit.create(ProdutoService.class);
    }
    public ProdutoService getProdutoService() {
        return produtoService;
    }
}
