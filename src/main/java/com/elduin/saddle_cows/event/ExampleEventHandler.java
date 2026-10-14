package com.elduin.saddle_cows.event;

import com.elduin.saddle_cows.ModTemplate;
import net.minecraft.server.level.ServerPlayer;

public class ExampleEventHandler {

	public static void onPlayerHurt(ServerPlayer player) {
		ModTemplate.LOGGER.info("{} took damage.", player.getDisplayName());
	}
}
