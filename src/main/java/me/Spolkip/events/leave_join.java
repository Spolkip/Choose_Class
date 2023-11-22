package me.Spolkip.events;


import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class leave_join implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){

        Player p = e.getPlayer();
        String name = p.getName();

        if (p.hasPlayedBefore()) {
            e.joinMessage(Component.text("" + name +" has joined back to Atlascore, welcome back!"  , TextColor.color(0 , 153 , 0)));

        }else if (!p.hasPlayedBefore()) {
            e.joinMessage(Component.text("" + name + ", Welcome  to AtlasCore for the first time! I wish this to be the beginning on a great adventure!", TextColor.color(0, 153, 0)));
        }
        else{
            p.sendMessage(Component.text("How did you get here?", TextColor.color(0, 153, 0)));
        }


    }
}
