package info.ahaha.bedwars.API;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;
import org.bukkit.material.Bed;

import java.util.Set;

public interface Team {
    Set<OfflinePlayer> getPlayers();

    public Bed getBed();

    public Block[] getBedPos();

    public int getMaxPlayer();

    public Location getResourceGeneratorPos();

    public Location getRespawnPos();

    public void registerGene();

    public void unregisterGene();

    public void setIronGenTick(long Tick);

    public void setGoldGenTick(long Tick);

    ChatColor getColor();
}
