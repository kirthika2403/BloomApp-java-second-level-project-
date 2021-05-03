package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.FlowerInventory;

public class FlowersAvailableTest {

	@Test
	public void test1() {
		
		   //Says the count of the flower types
		
			FlowerInventory.displayFlowers();
			String category = "Natural";
			int s=FlowerInventory.countFlowers(category);
			System.out.println("no of floral types avalilable "+s+" in natural");
			assertEquals(s,3);
		}
	@Test
	public void test2() {
		
		   //Says the count of the flower types(invalid input)
		
			FlowerInventory.displayFlowers();
			String category = "Natur";
			int s=FlowerInventory.countFlowers(category);
			System.out.println("no of floral types avalilable "+s+" in natural");
			assertEquals(s,0);
		}

	}


