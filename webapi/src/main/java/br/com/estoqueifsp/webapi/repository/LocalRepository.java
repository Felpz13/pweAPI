package br.com.estoqueifsp.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estoqueifsp.webapi.entity.Local;


@Repository
public interface LocalRepository extends JpaRepository<Local, Long> { }
