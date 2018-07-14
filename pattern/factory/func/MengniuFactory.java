package factory.func;

import factory.easy.MengniuMilk;
import factory.easy.Milk;

public class MengniuFactory implements Factory {

	@Override
	public Milk getMilk() {
		// TODO Auto-generated method stub
		return new MengniuMilk();
	}

}
