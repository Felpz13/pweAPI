package br.com.estoqueifsp.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estoqueifsp.webapi.entity.CargoHandling;

@Repository
public interface CargoHandlingRepository extends JpaRepository<CargoHandling, Long> {

} 

