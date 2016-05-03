package com.code.impl;

import com.code.intf.Load;
import com.code.intf.Unit;

public class Heavy implements Load {

	@Override
	public int liftedBy(Unit unit) {
		if(unit instanceof Mechanical){
			return 1;
		}else{
			return -1;
		}
	}
}
