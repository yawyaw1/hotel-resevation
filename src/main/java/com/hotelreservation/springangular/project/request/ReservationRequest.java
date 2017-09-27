package com.hotelreservation.springangular.project.request;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;


public class ReservationRequest {

	private Long id;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate checkin;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate checkout;

	public ReservationRequest(LocalDate checkin, LocalDate checkout) {

		super();
		this.checkin = checkin;
		this.checkout = checkout;

	}

	public ReservationRequest() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}

}
