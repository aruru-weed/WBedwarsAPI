package info.ahaha.bedwars.API;

import org.bukkit.entity.Player;

import java.io.IOException;

public interface Game {
    void Save() throws IOException;

    void GameStart() ;

    public void GameEnd();

    Team getTeam(Player player);

    World getWorld();

    String getName();
}
