package com.example.labo01.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.labo01.models.Country_Serie;

@Transactional
public interface CountrySerieDao extends CrudRepository<Country_Serie, Long>  {
	
	@Query(value="SELECT * FROM country_serie WHERE serieID= ?#{[0]}", nativeQuery = true)
	public List<Country_Serie> findAll(Integer iCodigoReporte);
	
	
}
