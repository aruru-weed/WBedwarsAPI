package info.ahaha.bedwars.API.event;

import info.ahaha.bedwars.API.Game;
import info.ahaha.bedwars.API.Team;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PlayerRespawnByBedwarsEvent extends PlayerEvent {
    public PlayerRespawnByBedwarsEvent(Player who, Team team, Game game) {
        super(who);
        this.team = team;
        this.game = game;
    }

    Game game;
    Team team;

    public Team getTeam() {
        return team;
    }

    public Game getGame() {
        return game;
    }

    static HandlerList handlerList = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
