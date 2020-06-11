 package org.saxfreedom.SaxCoreX.commands;
 
 import org.bukkit.ChatColor;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
import org.saxfreedom.SaxCoreX.Main;
 
 public class saxcorexCommand
   implements CommandExecutor
 {
	
	   public saxcorexCommand(Main plugin) {
     plugin.getCommand("saxcorex").setExecutor(this);
   }
 
   
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     if (!(sender instanceof Player)) {
       sender.sendMessage("[SaxCoreX] Only players can execute this.");
       return true;
     } 
     
     Player p = (Player)sender;
     
     if (p.hasPermission("scx.info")) {
       p.sendMessage(ChatColor.RED + "SaxCoreX Information");
       p.sendMessage(ChatColor.AQUA + "Authors: " + ChatColor.GREEN + ChatColor.BOLD + ChatColor.ITALIC + "SaxBotDevelopment");
       p.sendMessage(ChatColor.GOLD + "Use /scver to see the version information.");
       p.sendMessage(ChatColor.YELLOW + "This plugin is open source to anyone to modify, this plugin falls under the MIT License on the github repo page.");
       p.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + "https://github.com/saxbot/SaxCoreX/");
       p.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + "https://github.com/saxbot/SaxCoreX/blob/master/LICENSE");
       return true;
     } 
     p.sendMessage(ChatColor.BLUE + "SaxCoreX " + ChatColor.DARK_GRAY + "> " + ChatColor.RED + "No permission.");
 
     
     return false;
   }
 }
