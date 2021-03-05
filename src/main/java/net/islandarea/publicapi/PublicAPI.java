package net.islandarea.publicapi;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PublicAPI {

    @Getter private static final Logger logger = LoggerFactory.getLogger(PublicAPI.class);

    public static void main(String... args) {
        long startTime = System.currentTimeMillis();
        getLogger().info("Pomyslnie uruchomiono w ciagu " + (System.currentTimeMillis() - startTime) + " ms!");

        // TODO: 05.03.2021 do zrobienia praktycznie wszystko, ale to na pozniej 8)
    }
}
