package graw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class grawweb {
	
	public static void main(String[] args) {  
		  
		// grow() ;
/*	 for(int i=0;i<100;i++){
    		 grow() ;
    	 }*/
		 //grow() ;
		
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(100);  
		  for (int i = 0; i < 10; i++) {  
		   final int index = i;  
		   fixedThreadPool.execute(new Runnable() {  
		    public void run() {  
		     try {  
		    	 for(int i=0;i<100;i++){
		    		 grow() ;
		    	 }
		     } catch (Exception e) {  
		      e.printStackTrace();  
		     }  
		    }  
		   });  
		  }  
		 }  
	
	public static void grow() {
		InputStream is = null;
		
		try {
			
			URL url = new URL("http://sc.travelsky.com/scet/airAvail.do");
			
			URLConnection uc = url.openConnection();
			
		    is = uc.getInputStream();
		 
			InputStreamReader isr = new InputStreamReader(is);
			
			BufferedReader br = new BufferedReader(isr);
			
			String a = null;
			while(( a = br.readLine())!=null){
				System.out.println(a);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
}
