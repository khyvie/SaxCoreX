package org.saxfreedom.SaxCoreX.commands;

	import java.util.List;
 import net.md_5.bungee.api.ChatColor;
 import org.bukkit.Bukkit;
 import org.bukkit.Server;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
import org.saxfreedom.SaxCoreX.Main;
 
 public class condemn implements CommandExecutor {
	 
	   public condemn(Main plugin) {
     plugin.getCommand("condemn").setExecutor(this);
   }
   
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     List<Player> targets = Bukkit.matchPlayer(args[0]);
     Player trg = targets.get(0);
     Player e = (Player)sender;
     Server s = Bukkit.getServer();
     trg.setHealth(0.0D);
     trg.getWorld().strikeLightning(trg.getLocation());
     trg.getWorld().strikeLightning(trg.getLocation());
     trg.getWorld().strikeLightning(trg.getLocation());
     trg.getWorld().strikeLightning(trg.getLocation());
     trg.getWorld().strikeLightning(trg.getLocation());
     trg.getWorld().strikeLightning(trg.getLocation());
     trg.getWorld().strikeLightning(trg.getLocation());
     trg.getWorld().strikeLightning(trg.getLocation());
     trg.getWorld().strikeLightning(trg.getLocation());
     trg.getWorld().strikeLightning(trg.getLocation());
     e.sendMessage("" + ChatColor.WHITE + ChatColor.BLUE + ChatColor.BOLD + "You've condemned " + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + trg.getName() + ChatColor.BLUE + ChatColor.BOLD + " to " + ChatColor.GRAY + ChatColor.BOLD + "DEATH" + ChatColor.BLUE + ChatColor.BOLD + ".");
     trg.sendMessage("" + ChatColor.WHITE + ChatColor.DARK_RED + ChatColor.BOLD + "You've been condemned to " + ChatColor.GRAY + ChatColor.BOLD + "DEATH" + ChatColor.DARK_RED + ".");
     trg.sendMessage("" + ChatColor.WHITE + ChatColor.GOLD + ChatColor.BOLD + "Condemned by: " + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + e.getName() + ChatColor.GOLD + ChatColor.BOLD + ".");
     s.broadcastMessage(ChatColor.WHITE + trg.getName() + ChatColor.WHITE + " was condemned to death by " + ChatColor.WHITE + e.getName());
return true;
   }
 }
