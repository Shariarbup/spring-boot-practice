package com.bjit.engine;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String engineType;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(String engineType) {
		super();
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public boolean turnOn() {
		return true;
	};
}
