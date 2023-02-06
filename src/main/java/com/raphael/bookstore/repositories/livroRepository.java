package com.raphael.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raphael.bookstore.domain.Livro;

@Repository
public interface livroRepository extends JpaRepository<Livro, Integer>{

}
