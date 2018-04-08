package factory.abstr;

import factory.easy.MengniuMilk;
import factory.easy.Milk;
import factory.easy.YiliMilk;

public class MilkFactory extends AbstractFactory {

	@Override
	public Milk getYiliMilk() {
		return new YiliMilk();
	}

	@Override
	public Milk getMengniuMilk() {
		return new MengniuMilk();
	}

}
