package xyz.phoenix.phoneix.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;


public class EventWeatherChange implements Listener {

    @EventHandler
    public void ClearWeather(WeatherChangeEvent event) {

        if(event.toWeatherState()) {
            event.setCancelled(true);
            event.getWorld().setTime(1000);
        }
    }
}
