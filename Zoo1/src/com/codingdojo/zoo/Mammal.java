package com.codingdojo.zoo;

public class Mammal {

		private Integer energyLevel=100;
		

		public void displayEnergy() {
			System.out.println(energyLevel);
		}
		
		public Integer getEnergyLevel() {
			return energyLevel;
		}

		public void setEnergyLevel(Integer energyLevel) {
			this.energyLevel = energyLevel;
		}
		
}
