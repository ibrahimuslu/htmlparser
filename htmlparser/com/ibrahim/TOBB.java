package com.ibrahim;

public class TOBB {

	private String name;
	private String address;
	private String city;
	private String phone1;
	private String phone2;
	private String fax;
	private String web;
	private String email;
	private String president;
	private String meclisPresident;
	private String generalSecretary;
	
	
	public TOBB() {
	}
	public TOBB(String name, String address, String city, String phone1,
			String phone2, String fax, String web, String email,
			String president, String meclisPresident, String generalSecretary) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.fax = fax;
		this.web = web;
		this.email = email;
		this.president = president;
		this.meclisPresident = meclisPresident;
		this.generalSecretary = generalSecretary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public String getMeclisPresident() {
		return meclisPresident;
	}
	public void setMeclisPresident(String meclisPresident) {
		this.meclisPresident = meclisPresident;
	}
	public String getGeneralSecretary() {
		return generalSecretary;
	}
	public void setGeneralSecretary(String generalSecretary) {
		this.generalSecretary = generalSecretary;
	}


	@Override
	public String toString() {
		return "TOBB [name=" + name + ", address=" + address + ", city=" + city
				+ ", phone1=" + phone1 + ", phone2=" + phone2 + ", fax=" + fax
				+ ", web=" + web + ", email=" + email + ", president="
				+ president + ", meclisPresident=" + meclisPresident
				+ ", generalSecretary=" + generalSecretary + "]";
	}
}
