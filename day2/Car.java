package week1.day2;

public class Car {
          public void applyBreak() {
        	   System.out.println("press break");      	   
          }
        public void applyGear() {
        	 System.out.println("handle gear");
        }
        public void switchOnAc() {
        	System.out.println("0n ac");
               }
        public void applyAcclerate() {
        	System.out.println("press acclerate");
        }
        public static void main(String[] args) {
        	Car car=new Car();
        	car.applyAcclerate();
        	car.applyBreak();
        	car.applyGear();
        }
        	
        }

          

