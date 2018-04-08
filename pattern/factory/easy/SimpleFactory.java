package factory.easy;

public class SimpleFactory {
	
	public Milk getMilk(String milkName){
		
		if(milkName.equals("yili")){
			YiliMilk yili = new YiliMilk();
			return yili;
		}else if("mengniu".equals(milkName)){
			return new MengniuMilk();
		}
		return null;
	}
}
