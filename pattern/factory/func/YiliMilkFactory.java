package factory.func;

import factory.easy.Milk;
import factory.easy.YiliMilk;

public class YiliMilkFactory implements Factory {

	@Override
	public Milk getMilk() {
		return new YiliMilk();
	}

}
