package factory.func;

import factory.easy.Milk;

public interface Factory {

	//工厂必然具有生产产品的技能，统一的产品出口
    Milk getMilk();
	
	
}
