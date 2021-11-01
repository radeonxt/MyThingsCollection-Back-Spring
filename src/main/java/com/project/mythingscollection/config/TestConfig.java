package com.project.mythingscollection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.mythingscollection.service.DbService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DbService dbservice;
	
	@Bean
	public void instanciaBaseDados() {
		this.dbservice.instanciaBaseDados();
	}
}
