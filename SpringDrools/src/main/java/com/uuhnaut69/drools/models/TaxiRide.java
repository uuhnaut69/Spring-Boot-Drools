package com.uuhnaut69.drools.models;

public class TaxiRide {

	private Boolean isNightSurcharge;
	private Long distanceInMile;

	public Boolean getIsNightSurcharge() {
		return isNightSurcharge;
	}

	public void setIsNightSurcharge(Boolean isNightSurcharge) {
		this.isNightSurcharge = isNightSurcharge;
	}

	public Long getDistanceInMile() {
		return distanceInMile;
	}

	public void setDistanceInMile(Long distanceInMile) {
		this.distanceInMile = distanceInMile;
	}

	public TaxiRide(Boolean isNightSurcharge, Long distanceInMile) {
		this.isNightSurcharge = isNightSurcharge;
		this.distanceInMile = distanceInMile;
	}

	public TaxiRide() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TaxiRide [isNightSurcharge=" + isNightSurcharge + ", distanceInMile=" + distanceInMile + "]";
	}

}
