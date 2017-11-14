package com.win.pojo;

public class quality {

	private int id;
	private int did;
	private String time;
	private int pm;
	private int pmm;
	private String station;
	private String modify;
	private district district;
	
	public quality(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDid() {
		return did;
	} 
	public void setDid(int did) {
		this.did = did;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPm() {
		return pm;
	}
	public void setPm(int pm) {
		this.pm = pm;
	}
	public int getPmm() {
		return pmm;
	}
	public void setPmm(int pmm) {
		this.pmm = pmm;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getModify() {
		return modify;
	}
	public void setModify(String modify) {
		this.modify = modify;
	}
	public district getDistrict() {
		return district;
	}
	public void setDistrict(district district) {
		this.district = district;
	}
	
}
