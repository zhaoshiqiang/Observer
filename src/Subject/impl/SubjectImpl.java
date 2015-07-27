package Subject.impl;

import Subject.Subject;
import Support.Support;

public class SubjectImpl implements Subject {
	//����һ��support�����ã����е�
	Support support;

	public SubjectImpl(Support support) {
		// TODO Auto-generated constructor stub
		this.support=support;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		support.notifyListener("start");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		support.notifyListener("stop");
		
	}
	
	

}
