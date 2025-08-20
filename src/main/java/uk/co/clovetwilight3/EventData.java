package uk.co.clovetwilight3;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class EventData {
    public boolean eventActive;
    public long eventStartTime;
    public long firstDragonDeathTime;
    public List<UUID> eggHolders;
    public UUID daggerHolder;
    public List<UUID> crossedSwordsHolders;
    public UUID muscleToneHolder;
    public UUID wingHolder;
    public UUID packageHolder;
    public Map<UUID, Double> dragonDamage;
    public boolean firstDragonKilled;
}