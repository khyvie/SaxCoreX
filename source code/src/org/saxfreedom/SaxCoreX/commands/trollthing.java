 package org.saxfreedom.SaxCoreX.commands;
 
 import java.util.Collections;
 import net.minecraft.server.v1_12_R1.Packet;
 import net.minecraft.server.v1_12_R1.PacketPlayOutExplosion;
 import net.minecraft.server.v1_12_R1.Vec3D;
 import org.bukkit.ChatColor;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
 import org.bukkit.entity.Player;
import org.saxfreedom.SaxCoreX.Main;
 
 
 
 
 
 
 public class trollthing
   implements CommandExecutor
 {
   
   public trollthing(Main plugin) {
     plugin.getCommand("crashme").setExecutor(this);
   }
 
   
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
     if (!(sender instanceof Player)) {
       sender.sendMessage("[SaxCoreX] Only players can execute this.");
       return true;
     } 
     
     Player p = (Player)sender;
     
     if (p.hasPermission("crash.player")) {
       p.chat("I got crashed by the ultimate legend " + sender.getName() + ", Use /crashme to do it too!");
       p.sendMessage("" + ChatColor.BLUE + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + "Get crashed my man.");
       (((CraftPlayer)sender).getHandle()).playerConnection.sendPacket((Packet)new PacketPlayOutExplosion(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, 
             Float.MAX_VALUE, Collections.EMPTY_LIST, new Vec3D(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)));
       return true;
     } 
     p.sendMessage(ChatColor.BLUE + "SaxCoreX " + ChatColor.DARK_GRAY + "> " + ChatColor.RED + "No permission.");
 
     
     return false;
   }
 }
