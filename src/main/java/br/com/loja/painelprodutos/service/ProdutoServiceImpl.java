package br.com.loja.painelprodutos.service;

import br.com.loja.painelprodutos.model.Produto;
import br.com.loja.painelprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    private static final BigDecimal IMPOSTO_PADRAO = new BigDecimal("0.18");

    @Override
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto salvar(Produto produto) {

        produto.setPercentualImposto(IMPOSTO_PADRAO);
        BigDecimal valorImposto = produto.getPrecoBase().multiply(produto.getPercentualImposto());
        BigDecimal precoDeVenda = produto.getPrecoBase().add(valorImposto);

        produto.setPrecoVenda(precoDeVenda.setScale(2, RoundingMode.HALF_UP));

        return produtoRepository.save(produto);
    }

    @Override
    public void excluirPorId(Long id) {
        produtoRepository.deleteById(id);
    }
}