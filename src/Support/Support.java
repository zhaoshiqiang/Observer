package Support;

import Listener.Listener;
//他负责通知观察者，所有观察者由他统一管理
public interface Support {
	public void addListener(Listener l);
	public void removeListener(Listener l);
	public void notifyListener(Object o);
}
