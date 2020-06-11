 package org.saxfreedom.SaxCoreX.commands;
 
 import org.bukkit.ChatColor;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.entity.Player;
import org.saxfreedom.SaxCoreX.Main;
 
 public class gayCommand
   implements CommandExecutor
 {
   public gayCommand(Main plugin) {
     plugin.getCommand("gay").setExecutor(this);
   }
 
   
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (!(sender instanceof Player)) {
      sender.sendMessage("[SaxCoreX] Only players can execute this.");
      return true;
     } 
     
    Player p = (Player)sender;
     
    if (p.hasPermission("youare.gay")) {
       p.sendMessage("" + ChatColor.BLUE + ChatColor.RED + ChatColor.BOLD + "Yes, you're gay. Glad you know it.");
       return true;
     } 
   p.sendMessage(ChatColor.BLUE + "SaxCoreX " + ChatColor.DARK_GRAY + "> " + ChatColor.RED + "No permission.");
 
     
    return false;
   }
 }
