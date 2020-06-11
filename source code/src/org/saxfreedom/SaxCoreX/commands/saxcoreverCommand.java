 package org.saxfreedom.SaxCoreX.commands;
 
 import org.bukkit.ChatColor;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
import org.saxfreedom.SaxCoreX.Main;
 
 
 public class saxcoreverCommand
   implements CommandExecutor
 {
	
	   public saxcoreverCommand(Main plugin) {
     plugin.getCommand("saxcorever").setExecutor(this);
   }
 
   
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     if (!(sender instanceof Player)) {
       sender.sendMessage("[SaxCoreX] Only players can execute this.");
       return true;
     } 
     
     Player p = (Player)sender;
     
     if (p.hasPermission("scxver.use")) {
       p.sendMessage(ChatColor.GREEN + "The server is running SaxCoreX v1.1.2 for 1.12.2 Paper/Spigot/Bukkit");
       return true;
     } 
     p.sendMessage(ChatColor.BLUE + "SaxCoreX " + ChatColor.DARK_GRAY + "> " + ChatColor.RED + "No permission.");
 
     
     return false;
   }
 }
