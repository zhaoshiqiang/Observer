package Supportimpl;

import java.util.ArrayList;
import java.util.List;

import Listener.Listener;
import Support.Support;

public class SupportImpl implements Support {

	private List<Listener> list=new ArrayList<Listener>();
	
	public void addListener(Listener l) {
		// TODO Auto-generated method stub
		list.add(l);
	}

	public void removeListener(Listener l) {
		// TODO Auto-generated method stub
		list.remove(l);
	}

	public void notifyListener(Object o) {
		// TODO Auto-generated method stub
		for(Listener l:list){
			l.update(o);
		}
	}

}
