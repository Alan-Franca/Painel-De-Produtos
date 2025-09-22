package br.com.loja.painelprodutos.service;

import br.com.loja.painelprodutos.model.Produto;
import java.util.List;
import java.util.Optional;

public interface ProdutoService {
    List<Produto> listarTodos();
    Optional<Produto> buscarPorId(Long id);
    Produto salvar(Produto produto);
    void excluirPorId(Long id);
}