package com.gamemaker.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class GameDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String path;

	@OneToMany(mappedBy= "gameId", cascade = CascadeType.ALL)
	private List<PlayerDetails> playerDetails;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<PlayerDetails> getPlayerDetails() {
		return playerDetails;
	}

	public void setPlayerDetails(List<PlayerDetails> playerDetails) {
		this.playerDetails = playerDetails;
	}
	
	public void addPlayerDetails(PlayerDetails details) {
		
		if(playerDetails == null)
			playerDetails = new ArrayList<>();
		
		playerDetails.add(details);
	}

}
