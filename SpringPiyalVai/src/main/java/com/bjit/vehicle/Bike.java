package com.bjit.vehicle;

import com.bjit.engine.Combustion;

public class Bike implements Vehicle{
Combustion combustionEngine;
	

	public Combustion getCombustionEngine() {
		return combustionEngine;
	}

	public void setCombustionEngine(Combustion combustionEngine) {
		this.combustionEngine = combustionEngine;
	}

	@Override
	public void setName() {
		System.out.println("Bike");
	}
}
