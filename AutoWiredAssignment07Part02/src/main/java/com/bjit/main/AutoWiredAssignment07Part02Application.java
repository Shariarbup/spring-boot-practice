package com.bjit.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.bjit.vehicle.Vehicle;

@SpringBootApplication
@ImportResource({ "classpath:BeanConfig.xml" })
public class AutoWiredAssignment07Part02Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutoWiredAssignment07Part02Application.class, args);
		System.out.println("\n------------------------------------------\n");
		Vehicle car = (Vehicle) context.getBean("vehicle1");
		System.out.println("Vehicle Name: " + car.getName());
		System.out.println("Engine Type: " + car.getEngine().getEngineType());
		System.out.println("Turn ON: " + car.getEngine().turnOn());
		System.out.println("\n------------------------------------------\n");
		Vehicle bike = (Vehicle) context.getBean("vehicle2");
		System.out.println("Vehicle Name: " + bike.getName());
		System.out.println("Engine Type: " + bike.getEngine().getEngineType());
		System.out.println("Turn ON: " + bike.getEngine().turnOn());
		System.out.println("\n------------------------------------------\n");

		Vehicle richk = (Vehicle) context.getBean("vehicle3");
		System.out.println("Vehicle Name: " + richk.getName());
		System.out.println("Engine Type: " + richk.getEngine().getEngineType());
		System.out.println("Turn ON: " + richk.getEngine().turnOn());
	}

}
