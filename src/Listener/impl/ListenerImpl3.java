package Listener.impl;

import Listener.Listener;

public class ListenerImpl3 implements Listener {

	@Override
	public void update(Object num) {
		// TODO Auto-generated method stub
		if(num instanceof Integer)
		{
			System.out.println(((Integer)num).intValue()-50);
		}else if(num instanceof String)
			System.out.println((String)num);
		
	}

}
