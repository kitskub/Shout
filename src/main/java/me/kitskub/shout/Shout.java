package me.kitskub.shout;

import org.bukkit.plugin.java.JavaPlugin;

public class Shout extends JavaPlugin{
	public static final String CMD = "shout";
	private static Shout instance;
	
	@Override
	public void onEnable() {
		instance = this;
        instance.getCommand(CMD).setExecutor(new ShoutCommand());
	}

	@Override
	public void onDisable() {
	}
    
    public static Shout getInstance() {
        return instance;
    }
    
    public double waitTime() {
        return getConfig().getDouble("wait-time");
        
    }
}