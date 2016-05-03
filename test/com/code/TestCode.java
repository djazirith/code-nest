package com.code;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.code.impl.Biological;
import com.code.impl.Heavy;
import com.code.impl.Light;
import com.code.impl.Mechanical;
import com.code.intf.Load;
import com.code.intf.Unit;

public class TestCode {
	
	private static Unit biological = null, mechanical = null;
	private static Load heavy = null, light = null;
	
	@BeforeClass
	public static void init(){
		biological = new Biological();
		mechanical = new Mechanical();
		heavy = new Heavy();
		light = new Light();
	}
	@Test
	public void testBiologicalLiftsLight() {
		assertEquals(1, biological.lifts(light));
	}
	@Test
	public void testBiologicalLiftsHeavy() {
		assertEquals(-1, biological.lifts(heavy));
	}
	@Test
	public void testHeavyIsLiftedByMechanical(){
		assertEquals(1, heavy.liftedBy(mechanical));
	}
	@Test
	public void testLightIsLiftedByMechanical() {
		assertEquals(-1, light.liftedBy(mechanical));
	}
	@AfterClass
	public static void destroy(){
		biological = null;
		mechanical = null;
		heavy = null;
		light = null;
	}
}
