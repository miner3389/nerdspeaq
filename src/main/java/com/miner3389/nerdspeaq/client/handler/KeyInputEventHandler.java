package com.miner3389.nerdspeaq.client.handler;

import com.miner3389.nerdspeaq.client.settings.NSKeyBindings;
import com.miner3389.nerdspeaq.reference.Key;
import com.miner3389.nerdspeaq.utility.LoggingHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
	private static Key getPressedKeybinding(){
		if (NSKeyBindings.charge.isPressed()){
			return Key.CHARGE;
		}else if(NSKeyBindings.release.isPressed()){
			return Key.RELEASE;
		}
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
		LoggingHelper.info(getPressedKeybinding());
	}
}