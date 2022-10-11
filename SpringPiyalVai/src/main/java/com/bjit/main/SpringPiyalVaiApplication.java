package com.bjit.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.bjit.vehicle.Bike;
import com.bjit.vehicle.Car;

@SpringBootApplication
@ImportResource({"classpath:BeanConfig.xml"})
public class SpringPiyalVaiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringPiyalVaiApplication.class, args);
		
		Car car = (Car) context.getBean("vehicle1");
		System.out.print("Vehicle name: ");
		car.setName();
		System.out.println("Engine Name: "+ car.getCombustionEngine().getEngineName());
		System.out.println("Turn On: "+ car.getCombustionEngine().turnOn());
		
		Bike bike = (Bike) context.getBean("vehicle2");
		System.out.print("Vehicle name: ");
		bike.setName();
		System.out.println("Engine Name: "+ bike.getCombustionEngine().getEngineName());
		System.out.println("Turn On: "+ bike.getCombustionEngine().turnOn());
		
	}

}
