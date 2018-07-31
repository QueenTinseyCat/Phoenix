package xyz.phoenix.phoneix.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;


public class EventWeatherChange implements Listener {

    @EventHandler
    public void ClearWeather(WeatherChangeEvent event) {

        if(event.toWeatherState()) {
            Bukkit.broadcastMessage("weather changed to clear");
            event.setCancelled(true);
        }




    }
}
