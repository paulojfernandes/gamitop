package com.gamitop.impl;

import java.util.ArrayList;
import java.util.List;

import com.gamitop.model.Achievement;
import com.gamitop.model.Player;

public interface IPlayer {
	
	/* GetPlayerLeaderboard */
	public Player getPlayer(int id_Entity,int id_Leaderboard,int id_Player);
	/* GetListEntity*/	
	public List<Player> getPlayersLeaderboard(int idEntity,int id_Leaderboard );
	/* CreateEntity*/
	public void addPlayer( String name, int score, int win, int lose, int totalGames, int entity, int leaderboard,
			String link, ArrayList<String> achievements);
	/* UpdateEntity*/
	public boolean updatePlayer( int id_player,int id_entity,int id_leaderboard,String name, int score, int win, int lose, int totalGames);
	/* RemoveEntity */
	public void removePlayer(int id_Entity,int id_Leaderboard,int id_Player);
	
	public void addPlayerAchievement(int idEntity,int id_achievement,int id_Player);
	
	public boolean removePlayerAchievement(int idEntity,int id_achievement, int id_Player);
	
	public List<Achievement> getPlayerAchievements(int id_Entity, int id_Player);
	
	
	
	


}
