package singleton.hungry;

public class Hungry {

	private Hungry(){};
	
	private static final Hungry hungry = new Hungry();
	
	
	/**
	 * 优点：线程安全　速度快
	 * 缺点：初始化的就塞入内存，加入你有十万个类  内存就爆炸了
	 * @return
	 */
	public static Hungry getInstance(){
		
		return hungry;
	}
	
	
	
}
