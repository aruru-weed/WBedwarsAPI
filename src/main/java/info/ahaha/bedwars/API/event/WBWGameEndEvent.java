package info.ahaha.bedwars.API.event;

import info.ahaha.bedwars.API.Game;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WBWGameEndEvent extends Event {
    public WBWGameEndEvent(Game game, int ID){
        this.game = game;
        this.ID = ID;
    }
    Game game;
    int ID;

    public Game getGame() {
        return game;
    }

    public int getID() {
        return ID;
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
