 package org.saxfreedom.SaxCoreX.commands;
 
 import org.bukkit.ChatColor;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
import org.saxfreedom.SaxCoreX.Main;
 
 
 public class testCommand
   implements CommandExecutor
 {
   
	
	      public testCommand(Main plugin) {
     plugin.getCommand("test").setExecutor(this);
   }
 
   
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     if (!(sender instanceof Player)) {
       sender.sendMessage("[SaxCoreX] Only players can execute this.");
       return true;
     } 
     
     Player p = (Player)sender;
     
     if (p.hasPermission("test.use")) {
       p.sendMessage(ChatColor.LIGHT_PURPLE + "I was Testing.");
       return true;
     } 
     p.sendMessage(ChatColor.BLUE + "SaxCoreX " + ChatColor.DARK_GRAY + "> " + ChatColor.RED + "No permission.");
 
     
     return false;
   }
 }
