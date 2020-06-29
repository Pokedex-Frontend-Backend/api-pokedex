package com.pokedex.service;

public class Pokemon {
	
	
	
	
	public Pokemon() {
		
	}
	
	private String name;
	private String url;
	//private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	/*public int getId() {
		return id;
	}
	public int setId(int id) {
		String[] urlFrac = url.split("/");
		return Integer.parseInt(urlFrac[urlFrac.length-1]);
	}
	*/

}
