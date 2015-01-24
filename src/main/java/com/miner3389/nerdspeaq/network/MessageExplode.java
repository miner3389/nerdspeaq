package com.miner3389.nerdspeaq.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class MessageExplode extends MessageBase<MessageExplode> {

	@Override
	public void fromBytes(ByteBuf buf) {
		
	}

	@Override
	public void toBytes(ByteBuf buf) {
		
	}

	@Override
	public void handleClientSide(MessageExplode message, EntityPlayer player) {
		
	}

	@Override
	public void handleServerSide(MessageExplode message, EntityPlayer player) {
		player.worldObj.createExplosion(player, player.posX, player.posY - 10, player.posZ, 3, true);
	}

}
