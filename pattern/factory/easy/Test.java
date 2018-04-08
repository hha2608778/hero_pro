package factory.easy;

public class Test {

	
	/**
	 * 提高可维护性 减少依赖
	 * @param args
	 */
	public static void main(String[] args) {
		//1.0 工厂之前自己造牛奶
		//System.out.println(new YiliMilk().getName());
		
		//2.0 小作坊生产牛奶
		SimpleFactory simpleFactory = new SimpleFactory();
		System.out.println(simpleFactory.getMilk("yili").getName());
	}
	
	
}
