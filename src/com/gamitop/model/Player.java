package com.gamitop.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "player")
public class Player {
	
	
	private int id ;
	private String name ;
	private int score;
	private int win;
	private int lose;
	private int totalGames;
	private int entity ;
	private int leaderboard ;
	private String link;
	private  ArrayList<String> achievements = new ArrayList<String>();
	
	
	/**
	 * @param id
	 * @param name
	 * @param score
	 * @param win
	 * @param lose
	 * @param totalGames
	 * @param entity
	 * @param leaderboard
	 * @param link
	 * @param achievements
	 */
	public Player(int id, String name, int score, int win, int lose, int totalGames, int entity, int leaderboard,
			String link, ArrayList<String> achievements) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.win = win;
		this.lose = lose;
		this.totalGames = totalGames;
		this.entity = entity;
		this.leaderboard = leaderboard;
		this.link = link;
		this.achievements = achievements;
	}



	/**
	 * 
	 */
	public Player() {
		super();
	}



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



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public int getWin() {
		return win;
	}



	public void setWin(int win) {
		this.win = win;
	}



	public int getLose() {
		return lose;
	}



	public void setLose(int lose) {
		this.lose = lose;
	}



	public int getTotalGames() {
		return totalGames;
	}



	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}



	public int getEntity() {
		return entity;
	}



	public void setEntity(int entity) {
		this.entity = entity;
	}



	public int getLeaderboard() {
		return leaderboard;
	}



	public void setLeaderboard(int leaderboard) {
		this.leaderboard = leaderboard;
	}



	public String getLink() {
		return link;
	}



	public void setLink(String link) {
		this.link = link;
	}



	public ArrayList<String> getAchievements() {
		return achievements;
	}



	public void setAchievements(ArrayList<String> achievements) {
		this.achievements = achievements;
	}

	
	
	
	
	
}
