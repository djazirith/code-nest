package com.code.impl;

import com.code.intf.Load;
import com.code.intf.Unit;

public class Mechanical implements Unit {
	
	@Override
	public int lifts(Load load) {
		if(load instanceof Mechanical){
			return 1;
		}else{
			return -1;
		}
	}
}
