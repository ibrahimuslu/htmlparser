package com.ibrahim;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class getNokiaPhoneName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Document doc;
		try {
	 
			for (int i = 1; i < 12; i++) {
				
				// need http protocol
				doc = Jsoup.connect("http://developer.nokia.com/Devices/Device_specifications/?page="+i+"&filter1=s40").get();
		 
				// get page title
//				String title = doc.title();
//				System.out.println("title : " + title);
		 
				// get all links
				Elements links = doc.select("a[href]");
				for (Element link : links) {
		 
					// get the value from href attribute
	//				System.out.println("\nlink : " + link.attr("href"));
					if(link.attr("href").contains("Devices") && link.text().contains("Nokia"))
						System.out.println("S40: " + link.text());
		 
				}
				
			
			}
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
