package com.bjit.engine;

public class Combustion implements Engine{
	String engineName;
	
//	public Combustion() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public Combustion(String engineName) {
//		super();
//		this.engineName = engineName;
//	}

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	@Override
	public boolean turnOn() {
		return true;
	}
}
