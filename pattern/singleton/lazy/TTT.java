package singleton.lazy;

public class TTT {
	
	public static void main(String[] args) {
		int x;
		int y;
		for(x=0;x<10000;x++){
			for(y=0;y<10000;y++){
				if(x+18==y+16){
			 		System.out.println("x="+x+"--y="+y+"--总价为="+(x+y));
				}
			}
		}
	}
	

}
