package me.crus3r.chatbukkit;

import org.bukkit.plugin.java.JavaPlugin;

import me.crus3r.chatbukkit.commands.MessageCommand;
import me.crus3r.chatbukkit.commands.ReplyCommand;
import me.crus3r.chatbukkit.commands.WhoCommand;

public class ChatBukkit extends JavaPlugin {
	    @Override
	    public void onEnable() {
	        getCommand("who").setExecutor(new WhoCommand(this));
	        getCommand("msg").setExecutor(new MessageCommand(this));
	        getCommand("reply").setExecutor(new ReplyCommand(this));
	    }
	}
	

