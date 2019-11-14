package br.com.estoqueifsp.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estoqueifsp.webapi.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> { }
