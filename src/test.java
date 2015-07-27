import Listener.Listener;
import Listener.impl.ListenerImpl1;
import Listener.impl.ListenerImpl2;
import Listener.impl.ListenerImpl3;
import Subject.Subject;
import Subject.impl.SubjectImpl;
import Support.Support;
import Supportimpl.SupportImpl;


public class test {
	
	public static void main(String[] args) {
		Listener l1=new ListenerImpl1();
		Listener l2=new ListenerImpl2();
		Listener l3=new ListenerImpl3();
		
		Support sup=new SupportImpl();
		sup.addListener(l1);
		sup.addListener(l2);
		sup.addListener(l3);
		
		Subject sub=new SubjectImpl(sup);
		sub.start();
		sub.stop();
	}
	
}
