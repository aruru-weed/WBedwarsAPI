package info.ahaha.bedwars.API;

public interface World {
    void setDiaGenTick(int Tick);

    void setEmeGenTick(int Tick);

    int getEmeGenTick();

    int getDiaGenTick();

    void unloads();
}
