package com.pokedex.service;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class PokeApplication {
	
/*
	RestTemplate restTemplate = new RestTemplate();
	@RequestMapping(value="/pokemons", method = RequestMethod.GET)
	public void consumeApi(){
		//RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Pokemon> entity = restTemplate.getForEntity("http://pokeapi.co/api/v2/pokemon",Pokemon.class);
		System.out.print(entity.getBody());
	}
*/	
	
	//@RequestMapping(value="/pokemons", method = RequestMethod.GET)
	//public static void callNames() {
	//public String getNames() {
		//RestTemplate restTemplate = new RestTemplate();
		//HttpHeaders headers = new HttpHeaders();
		//headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		//HttpEntity<String>entity=new HttpEntity<String>(headers);
		//System.out.print(restTemplate.exchange("https://pokeapi.co/api/v2/pokemon", HttpMethod.GET,entity,String.class).getBody());
		//return restTemplate.exchange("https://pokeapi.co/api/v2/pokemon", HttpMethod.GET,entity,String.class).getBody();
		//Pokemon pokemon = restTemplate.exchange("http://pokeapi.co/api/v2/pokemon", HttpMethod.GET,entity,Pokemon.class).getBody();
		
		
		//return restTemplate.exchange("http://pokeapi.co/api/v2/pokemon", HttpMethod.GET,entity,String.class).getBody();
		
		//System.out.print(pokemon.getName());
		
		//return pokemon.getName().toString();
		/*
		
		Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon",Pokemon.class);
		System.out.print(pokemon.getName());*/
		
		//FUNCIONA, MANDA EL JSON DE LOS NAMES Y URL
	/*@RequestMapping(value="/pokemons", method = RequestMethod.GET)
		public String getNames() {
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
			HttpEntity<String>entity=new HttpEntity<String>(headers);
			System.out.print(restTemplate.exchange("https://pokeapi.co/api/v2/pokemon?limit=200&offset=0", HttpMethod.GET,entity,String.class).getBody());
			return restTemplate.exchange("https://pokeapi.co/api/v2/pokemon?limit=200&offset=0", HttpMethod.GET,entity,String.class).getBody();
		*/
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(PokeApplication.class, args);
		
	}
	
	


}