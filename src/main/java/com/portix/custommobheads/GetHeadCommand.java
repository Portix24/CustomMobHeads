package com.portix.custommobheads;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class GetHeadCommand implements CommandExecutor {

    private final Main plugin;

    public GetHeadCommand(Main plugin) {
        this.plugin = plugin;
    }

    /*
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String @NotNull [] args) {
        Player player;
        if (!(sender instanceof Player)) {
            return false;
        } else {
            player = (Player) sender;
        }
        if (args.length < 1) return false;

        String mobKey = args[0].toLowerCase();
        String variant = args.length >= 2 ? args[1].toLowerCase() : null;
        String configPath = variant != null ? mobKey + "." + variant : mobKey;

        String name = plugin.translationsConfig.getString(configPath);
        String texture = plugin.texturesConfig.getString(configPath);

        if (texture == null || name == null) {
            player.sendMessage(Component.text("Unknown head: " + configPath));
            return true;
        }

        ItemStack head = plugin.createCustomHead(name, texture, Collections.singletonList(Component.text("Summoned via command")), args[0]);
        player.getInventory().addItem(head);
        player.sendMessage(Component.text("You received: " + name));
        return true;
    }
     */

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (!sender.isOp()) {
            sender.sendMessage(Component.text("You must be an operator to use this command."));
            return true;
        }

        if (args.length < 2) {
            sender.sendMessage(Component.text("Usage: /gethead <player> <mob_id> [variant] [subvariant]"));
            return true;
        }

        Player target = Bukkit.getPlayerExact(args[0]);
        if (target == null) {
            sender.sendMessage(Component.text("Player not found: " + args[0]));
            return true;
        }

        String mobKey = args[1].toLowerCase();

        // Only build variantKey if there are extra args
        String variantKey = null;
        if (args.length == 4) {
            variantKey = args[2].toLowerCase() + "." + args[3].toLowerCase();
        } else if (args.length == 3) {
            variantKey = args[2].toLowerCase();
        }

        String configPath = variantKey != null ? mobKey + "." + variantKey : mobKey;

        String name = plugin.translationsConfig.getString(configPath);
        String texture = plugin.texturesConfig.getString(configPath);

        if (texture == null) {
            sender.sendMessage(Component.text("Texture not found for: " + configPath));
            texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjM0MGQ1MGQ3ZDEyOTNiYTE2ZDIzYzZkMDdhYjA2NmNkYzE1NzVjNjhiY2E2OWU5NmYwYmI2ZDFjZTFiZjFiYSJ9fX0=";
        }

        if (name == null) {
            sender.sendMessage(Component.text("Translation not found for: " + configPath));
            name = "Unknown Head";
        }

        ItemStack head = plugin.createCustomHead(name, texture, Collections.singletonList(Component.text("Summoned via command")), configPath);
        target.getInventory().addItem(head);
        //sender.sendMessage(Component.text("✅ " + target.getName() + " received: " + name));
        return true;
    }
}

