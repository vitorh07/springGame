package com.senai.vitor.PrjGame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.vitor.PrjGame.entities.Jogo;
import com.senai.vitor.PrjGame.repositories.JogoRepository;

@Service
public class JogoService {

	private final JogoRepository jogoRepository;
	
	@Autowired
	public JogoService (JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	
	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}
	//listar todos os produtos
	public List<Jogo> getAllJogo(){
		return jogoRepository.findAll();
	}
	//apagar produto
	public void deleteProduto(Long id) {
		jogoRepository.deleteById(id);
	}
	
}
