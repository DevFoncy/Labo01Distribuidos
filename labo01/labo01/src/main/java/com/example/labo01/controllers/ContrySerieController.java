package com.example.labo01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.labo01.dao.CountrySerieDao;
import com.example.labo01.models.Country_Serie;

@Controller
@RequestMapping("Serie")
public class ContrySerieController {
	
	@Autowired
	private CountrySerieDao countrySerieDao;

	@RequestMapping(value = "get1", method = RequestMethod.GET)
	@ResponseBody
	public List<Country_Serie> getSQL1(Integer iTipoConsulta) {
		List<Country_Serie> listCountrySerie=null;
		try {
			listCountrySerie = countrySerieDao.findAll(iTipoConsulta);
		} catch (Exception ex) {
			System.out.println("Error creating the user: " + ex.toString());
		}
		return listCountrySerie;
	}
	
}
