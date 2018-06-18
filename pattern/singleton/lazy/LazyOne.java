package singleton.lazy;

/**
 * 懒汉单例
 * 防止了并发不安全
 * 但是效率很低
 * @author Administrator
 *
 */
public class LazyOne {

	
	private static LazyOne lazyOne = null;
	
	public synchronized LazyOne getInstance(){
		
		if(lazyOne == null){
			lazyOne = new LazyOne();
		}
		return lazyOne;
	}
	
}
