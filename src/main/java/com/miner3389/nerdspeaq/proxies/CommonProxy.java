package com.miner3389.nerdspeaq.proxies;

public abstract class CommonProxy implements IProxy{
	public abstract void preInit();
	
	public abstract void init();
	
	public abstract void postInit();
}
