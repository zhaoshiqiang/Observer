package Listener.impl;

import Listener.Listener;

public class ListenerImpl1 implements Listener {

	@Override
	public void update(Object num) {
		// TODO Auto-generated method stub
		if(num instanceof Integer)
		{
			System.out.println(((Integer)num).intValue()-10);
		}
		
	}

}
