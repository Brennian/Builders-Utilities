package net.arcaniax.buildersutilities.commands;

import net.arcaniax.buildersutilities.Main;
import net.arcaniax.buildersutilities.Settings;
import net.arcaniax.buildersutilities.commands.system.ICommand;
import net.arcaniax.buildersutilities.menus.Menus;
import org.bukkit.entity.Player;

public class UtilsCommand implements ICommand {
    @Override
    public void execute(Player player, String[] args) {
        if (!player.hasPermission("builders.util.gui")) {
            if (Settings.sendErrorMessages) {
                player.sendMessage(Main.MSG_ERROR + "You do not have access to this command.");
            }
            return;
        }

        Menus.TOGGLE_MENU.open(player);
    }
}