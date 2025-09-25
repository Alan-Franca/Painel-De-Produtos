package br.com.loja.painelprodutos;

import br.com.loja.painelprodutos.model.Categoria;
import br.com.loja.painelprodutos.repository.CategoriaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Arrays;

@SpringBootApplication
public class PainelProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PainelProdutosApplication.class, args);
	}
    @SuppressWarnings("unused")
    @Bean
    CommandLineRunner initDatabase(CategoriaRepository categoriaRepository) {
        return args -> {
            if (categoriaRepository.count() == 0) {
                System.out.println("Populando categorias...");
                Categoria c1 = new Categoria("Eletrodoméstico");
                Categoria c2 = new Categoria("Eletrônicos");
                Categoria c3 = new Categoria("Informática");
                Categoria c4 = new Categoria("Hardware");
                Categoria c5 = new Categoria("Periféricos");
                Categoria c6 = new Categoria("Para Escritório");
                Categoria c7 = new Categoria("Espaço Gamer");

                categoriaRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7));
                System.out.println("Categorias populadas!");
            }
        };
    }
}
