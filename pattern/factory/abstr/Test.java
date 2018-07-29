package factory.abstr;

/**
 * 把抽象  有共性的逻辑 写到 父类里面 
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MilkFactory mf = new MilkFactory();
		System.out.println(mf.getMengniuMilk().getName());
	}

}
