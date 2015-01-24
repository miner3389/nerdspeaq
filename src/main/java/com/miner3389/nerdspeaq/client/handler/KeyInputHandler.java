package com.miner3389.nerdspeaq.client.handler;

import com.miner3389.nerdspeaq.client.settings.NSKeyBindings;
import com.miner3389.nerdspeaq.network.MessageExplode;
import com.miner3389.nerdspeaq.network.NetworkHandler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputHandler {
	
	private NSKeyBindings getPressedKey(){
		for(NSKeyBindings key : NSKeyBindings.values()){
			if(key.isPressed()) return key;
		}
		return null;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
		NSKeyBindings key = getPressedKey();
		if(key != null){
			switch(key){
				case EXPLODE:
					NetworkHandler.sendToServer(new MessageExplode());
					break;
			}
		}
	}
}
