package com.raphael.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.bookstore.domain.Categoria;
import com.raphael.bookstore.domain.Livro;
import com.raphael.bookstore.repositories.CategoriaRepository;
import com.raphael.bookstore.repositories.livroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private livroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Inforamtica", "Livro TI");
		Categoria cat2 = new Categoria(null, "Ficção", "terra plana");
		Categoria cat3 = new Categoria(null, "Biologia", "Macaco azul");

		Livro l1 = new Livro(null, "Clean Code", "Robert Mart", "Loren ipum", cat1);
		Livro l2 = new Livro(null, "Engenharia", "Robert Part", "Loren ipum", cat1);
		Livro l3 = new Livro(null, "Num sei1", "Robert Dart", "Loren ipum", cat1);
		Livro l4 = new Livro(null, "Num sei2", "Robert Clart", "Loren ipum", cat1);
		Livro l5 = new Livro(null, "Num sei3", "Robert Tart", "Loren ipum", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}

}
