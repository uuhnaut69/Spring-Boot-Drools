package com.uuhnaut69.drools.models;

public class Fare {

	private Long nightSurcharge;
	private Long rideFare;

	public Long getNightSurcharge() {
		return nightSurcharge;
	}

	public void setNightSurcharge(Long nightSurcharge) {
		this.nightSurcharge = nightSurcharge;
	}

	public Long getRideFare() {
		return rideFare;
	}

	public void setRideFare(Long rideFare) {
		this.rideFare = rideFare;
	}

	public Fare(Long nightSurcharge, Long rideFare) {
		this.nightSurcharge = nightSurcharge;
		this.rideFare = rideFare;
	}

	public Fare() {
		// TODO Auto-generated constructor stub
		nightSurcharge = 0L;
		rideFare = 0L;
	}

	@Override
	public String toString() {
		return "Fare [nightSurcharge=" + nightSurcharge + ", rideFare=" + rideFare + "]";
	}

	public Long getTotalFare() {
		return nightSurcharge + rideFare;
	}

}
