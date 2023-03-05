/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;
import org.springframework.web.bind.annotation.*;


import java.util.*;

import com.example.player.PlayerService;

@RestController
class PlayerController {
    PlayerService playerService = new PlayerService();

    @GetMapping("/players")
    public  ArrayList<Player>  getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerId(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerId(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player teamPlayer){
        return playerService.addPlayer(teamPlayer);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId")int playerId,@RequestBody Player teamPlayer) {
        return playerService.updatePlayer(playerId, teamPlayer);
    }
    
    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId){
        playerService.deletePlayer(playerId);
    }
}