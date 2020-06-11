package org.saxfreedom.SaxCoreX;

import org.bukkit.plugin.java.JavaPlugin;
import org.saxfreedom.SaxCoreX.commands.condemn;
import org.saxfreedom.SaxCoreX.commands.gayCommand;
import org.saxfreedom.SaxCoreX.commands.saxcoreverCommand;
import org.saxfreedom.SaxCoreX.commands.saxcorexCommand;
import org.saxfreedom.SaxCoreX.commands.testCommand;
import org.saxfreedom.SaxCoreX.commands.trollthing;
public class Main extends JavaPlugin {
  public void onEnable() {
	  this.getCommand("gay").setExecutor(new gayCommand(this));
	  this.getCommand("saxcorever").setExecutor(new saxcoreverCommand(this));
	  this.getCommand("saxcorex").setExecutor(new saxcorexCommand(this));
	  this.getCommand("condemn").setExecutor(new condemn(this));
	  this.getCommand("test").setExecutor(new testCommand(this));
	  this.getCommand("crashme").setExecutor(new trollthing(this));
	  
  }
}
