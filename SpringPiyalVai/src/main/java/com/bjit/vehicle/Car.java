package com.bjit.vehicle;

import com.bjit.engine.Combustion;

public class Car implements Vehicle {
	Combustion combustionEngine;
	
//	public Car() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Car(Combustion combustionEngine) {
//		super();
//		this.combustionEngine = combustionEngine;
//	}

	public Combustion getCombustionEngine() {
		return combustionEngine;
	}

	public void setCombustionEngine(Combustion combustionEngine) {
		this.combustionEngine = combustionEngine;
	}

	@Override
	public void setName() {
		System.out.println("Car");
	}
}
