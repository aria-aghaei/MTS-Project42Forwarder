package com.aa.mts.forwarder;

import java.util.Date;

public class CellInfo {
	
	public long skey;

	private Date insert;
	
	private Date update;
	
	private double rsrp;
	
	private double rsrq;
	
	private double snr;
	
	private double pci;
	
	private String phnNo;
	
	private String srlNo;
	
	private String nwOpr;
	
	private String nwCon;
	
	private String dlSpd;
	
	private String ulSpd;
	
	private double lat;
	
	private double lon;
	
	private String city;
	
	private String speed;
	
//	private String rssi;
	
	private String imei;
	
	private String iccid;
	
	private int efcn;

	public long getSkey() {
		return skey;
	}

	public void set_id(long skey) {
		this.skey = skey;
	}

	public Date getInsert() {
		return insert;
	}

	public void setInsert(Date insert) {
		this.insert = insert;
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public double getRsrp() {
		return rsrp;
	}

	public void setRsrp(double rsrp) {
		this.rsrp = rsrp;
	}

	public double getRsrq() {
		return rsrq;
	}

	public void setRsrq(double rsrq) {
		this.rsrq = rsrq;
	}

	public double getSnr() {
		return snr;
	}

	public void setSnr(double snr) {
		this.snr = snr;
	}

	public double getPci() {
		return pci;
	}

	public void setPci(double pci) {
		this.pci = pci;
	}

	public String getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}

	public String getSrlNo() {
		return srlNo;
	}

	public void setSrlNo(String srlNo) {
		this.srlNo = srlNo;
	}

	public String getNwOpr() {
		return nwOpr;
	}

	public void setNwOpr(String nwOpr) {
		this.nwOpr = nwOpr;
	}

	public String getNwCon() {
		return nwCon;
	}

	public void setNwCon(String nwCon) {
		this.nwCon = nwCon;
	}

	public String getDlSpd() {
		return dlSpd;
	}

	public void setDlSpd(String dlSpd) {
		this.dlSpd = dlSpd;
	}

	public String getUlSpd() {
		return ulSpd;
	}

	public void setUlSpd(String ulSpd) {
		this.ulSpd = ulSpd;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

//	public String getRssi() {
//		return rssi;
//	}
//
//	public void setRssi(String rssi) {
//		this.rssi = rssi;
//	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public int getEfcn() {
		return efcn;
	}

	public void setEfcn(int efcn) {
		this.efcn = efcn;
	}
}
