package factory.abstr;

import factory.easy.Milk;

/**
 * 处理一些 公共的一些 生产逻辑
 * @author Administrator
 *
 */
public abstract class AbstractFactory {
	
	public abstract Milk getYiliMilk();
	
	public abstract Milk getMengniuMilk();

}
