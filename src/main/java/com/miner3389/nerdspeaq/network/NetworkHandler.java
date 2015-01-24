package com.miner3389.nerdspeaq.network;

import com.miner3389.nerdspeaq.reference.NSModReference;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class NetworkHandler {
	private static SimpleNetworkWrapper wrapper;
	
	public static void init(){
		wrapper = NetworkRegistry.INSTANCE.newSimpleChannel(NSModReference.MOD_ID);
		
		wrapper.registerMessage(MessageExplode.class, MessageExplode.class, 0, Side.SERVER);
	}
	
	public static void sendToServer(IMessage message){
		wrapper.sendToServer(message);
	}
}
