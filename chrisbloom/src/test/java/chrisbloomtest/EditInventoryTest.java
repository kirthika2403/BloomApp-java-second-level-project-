package chrisbloomtest;

import static org.junit.Assert.*;

import org.junit.Test;

import chrisbloom.FlowerInventory;

public class EditInventoryTest {

	@Test
	public void test() {
		
			// test 1 with correct category mentions
		
			String flowerType="garland";
			String category="artificial";
			int price= 1000;
			boolean valid=FlowerInventory.addFlowers(flowerType, category, price);
			assertEquals(true,valid);
			FlowerInventory.displayFlowers();
		}
	
	@Test
		public void test2() {
			
			//test 2 with incorrect category mention
		
			String flowerType1="Floral Rings";
			String category1="artificialq";
			int price1= 1000;
			boolean valid=FlowerInventory.addFlowers(flowerType1, category1, price1);
			assertEquals(false,valid);
			FlowerInventory.displayFlowers();
			
		}
	
	@Test
	public void test3(){
		
		//Delete an item and display- valid entry
		
		String flowerType="garland";
		String category= "artificial";
		boolean valid=FlowerInventory.deleteFlower(flowerType, category);
		assertEquals(true,valid);
		FlowerInventory.displayFlowers();
	}
	
	@Test
	public void test4(){
		
		//Delete an item and display- valid entry
		
		String flowerType="garland";
		String category= "artifi";
		boolean valid=FlowerInventory.deleteFlower(flowerType, category);
		assertEquals(false,valid);
		FlowerInventory.displayFlowers();
	}
}


