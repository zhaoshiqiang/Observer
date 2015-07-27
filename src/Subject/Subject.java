package Subject;

import Listener.Listener;
//主题类只需要关注自己的行为就好
public interface Subject {
	public void start();
	public void stop();
}
