package Support;

import Listener.Listener;
//������֪ͨ�۲��ߣ����й۲�������ͳһ����
public interface Support {
	public void addListener(Listener l);
	public void removeListener(Listener l);
	public void notifyListener(Object o);
}
