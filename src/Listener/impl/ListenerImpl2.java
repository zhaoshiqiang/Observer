package Listener.impl;

import Listener.Listener;

public class ListenerImpl2 implements Listener {

	@Override
	public void update(Object num) {
		// TODO Auto-generated method stub
		if(num instanceof String)
			System.out.println((String)num);
		
	}

}
