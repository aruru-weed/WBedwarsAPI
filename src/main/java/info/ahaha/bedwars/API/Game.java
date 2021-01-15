package info.ahaha.bedwars.API;

import org.bukkit.entity.Player;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public interface Game {
    void Save() throws IOException;

    void GameStart();

    public void GameEnd();

    Team getTeam(Player player);

    List<? extends Team> getTeams();

    World getWorld();

    String getName();

    int getID();
}
