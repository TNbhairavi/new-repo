package com.xworkz.override;

public class Lamp extends Tubelight{
	public Lamp()
	{
		System.out.println("no arg const in Lamp");
	}
	@Override
	public void glowing()
	{
		System.out.println("running glowing in lamp");
	}

}
