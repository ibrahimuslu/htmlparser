package com.ibrahim;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class getTOBBList {

	private static String name;
	private static String address;
	private static String city;
	private static String phone1;
	private static String phone2;
	private static String fax;
	private static String web;
	private static String email;
	private static String meclisPresident;
	private static String generalSecretary;
	private static String president;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Document doc;
		try {
	 
			
				
				// need http protocol
				doc = Jsoup.connect("http://www.tobb.org.tr/Sayfalar/TicaretveSanayiOdalari.php").get();
		 
				// get page title
//				String title = doc.title();
//				System.out.println("title : " + title);
				Element content = doc.getElementById("MSOZoneCell_WebPartWPQ2");
				// get all links
				List<TOBB> listTobb = new ArrayList<TOBB>();
				Elements links = content.getElementsByTag("ul");
					for (int i=0;i<links.size();i++) {
						
						if(i%11==0){
							if(name!=null)
							listTobb.add(new TOBB(name, address, city, phone1, phone2, fax, web, email, president, meclisPresident, generalSecretary));
							setName(links.get(i).text());
						}else if(i%11==1)
							setAddress(links.get(i).text().split(":")[1]);
						else if(i%11==2)
							setCity(links.get(i).text().split(":")[1]);
						else if(i%11==3)
							setPhone1(links.get(i).text().split(":")[1]);
						else if(i%11==4)
							setPhone2(links.get(i).text().split(":")[1]);
						else if(i%11==5)
							setFax(links.get(i).text().split(":")[1]);
						else if(i%11==6)
							setWeb(links.get(i).text().split(":")[1]);
						else if(i%11==7)
							setEmail(links.get(i).text().split(":")[1]);
						else if(i%11==8)
							setPresident(links.get(i).text().split(":")[1]);
						else if(i%11==9)
							setMeclisPresident(links.get(i).text().split(":")[1]);
						else if(i%11==10)
							setGeneralSecretary(links.get(i).text().split(":")[1]);
						
					}
				
		int k=0;
				for (TOBB element : listTobb) {
					System.out.println((++k) +" "+element.toString());
				}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		getTOBBList.name = name;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		getTOBBList.address = address;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		getTOBBList.city = city;
	}

	public static String getPhone1() {
		return phone1;
	}

	public static void setPhone1(String phone1) {
		getTOBBList.phone1 = phone1;
	}

	public static String getPhone2() {
		return phone2;
	}

	public static void setPhone2(String phone2) {
		getTOBBList.phone2 = phone2;
	}

	public static String getFax() {
		return fax;
	}

	public static void setFax(String fax) {
		getTOBBList.fax = fax;
	}

	public static String getWeb() {
		return web;
	}

	public static void setWeb(String web) {
		getTOBBList.web = web;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		getTOBBList.email = email;
	}

	public static String getMeclisPresident() {
		return meclisPresident;
	}

	public static void setMeclisPresident(String meclisPresident) {
		getTOBBList.meclisPresident = meclisPresident;
	}

	public static String getGeneralSecretary() {
		return generalSecretary;
	}

	public static void setGeneralSecretary(String generalSecretary) {
		getTOBBList.generalSecretary = generalSecretary;
	}

	public static String getPresident() {
		return president;
	}

	public static void setPresident(String president) {
		getTOBBList.president = president;
	}

}
