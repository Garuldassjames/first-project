 package com.adj;

public class E_Multilevelinheritance extends C_Singleinheritance {
	public void bikeSpecification() {
		System.out.println("Bike Details");
	}
	public void bikeName() {
		System.out.println("ROYAL ENFIELD: Classic 350");
	}
	public void mileageCapacity() {
		System.out.println("MILEAGE: 41.55 KMPL");
	}
	public void displacement() {
		System.out.println("Displacement: 349.34 cc");
	}
	public void fuelCapacity() {
		System.out.println("Fuel Capacity: 13L");
	}
	public void bikeType() {
		System.out.println("Bike Type: Cruiser Bike");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E_Multilevelinheritance h=new E_Multilevelinheritance();
		h.bikeSpecification();
		h.bikeName();
		h.mileageCapacity();
		h.displacement();
		h.fruitShop();
		h.fruitsName();
		h.fuelCapacity();
		h.bikeType();
	}

}
