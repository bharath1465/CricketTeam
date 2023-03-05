// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();
    

    Player getPlayerId(int playerId);

    Player addPlayer(Player teamPlayer);
    Player updatePlayer(int playerId,Player teamPlayer);

    void deletePlayer(int playerId);

}