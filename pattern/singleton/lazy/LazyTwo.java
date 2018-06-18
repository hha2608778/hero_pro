package singleton.lazy;

/**
 * 既安全又快的恶汉单例
 * 
 * 特点： 在外部类被调用的时候内部类才会被加载
 * 内部类一定是要在方法调用前初始化
 * 
 * 这种恶汉式兼顾了内存浪费，也兼顾了 synchronized性能问题
 * 完美屏蔽了这两个缺点
 * 史上最牛B的单例实现方式
 * 
 * @author Administrator
 *
 */
public class LazyTwo {
	
	
	private static boolean initialized = false;
	
	private LazyTwo(){
		//防止反射入侵
		synchronized (LazyTwo.class) {
			if(initialized==false){
				initialized = !initialized;
			}else{
				throw new RuntimeException("该类已被侵犯");
			}
		}
	}
	
	//static 是为了单例空间共享
	//保证这个方法不会被重写 重载
	public static final LazyTwo getInstance(){
		//在返回结果以前肯定会先加在内部类在返回
		return LazyHolder.LAZY;
	}
	//默认不加载
	private static class LazyHolder{
		private static final LazyTwo LAZY = new LazyTwo();
	}
	
	

}
