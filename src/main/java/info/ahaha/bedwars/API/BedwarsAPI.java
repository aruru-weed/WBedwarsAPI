package info.ahaha.bedwars.API;

import org.bukkit.World;

import java.io.IOException;

public interface BedwarsAPI {
    public Game load(String FileName, World inputWorld) throws IOException,ClassNotFoundException;

    public Game fineGame(String worldName);
}