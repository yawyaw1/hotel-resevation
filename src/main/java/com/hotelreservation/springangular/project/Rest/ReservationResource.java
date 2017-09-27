package com.hotelreservation.springangular.project.Rest;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotelreservation.springangular.project.request.ReservationRequest;
import com.hotelreservation.springangular.project.response.ReservationResponse;

import java.time.LocalDate;


@RestController
@RequestMapping(ResourceConstants.ROOM_RESERVATION_V1)
public class ReservationResource {

	@RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> getAvailableRooms(
			@RequestParam(value = "checkin") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkin,

			@RequestParam(value = "checkout") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkout) {

		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);

	}

	@RequestMapping(path = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> createReservation(

			@RequestBody ReservationRequest reservationRequest) {

		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);

	}

	@RequestMapping(path = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> updateRservation() {

		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);

	}

	// @RequestMapping(path="",method=RequestMethod.DELETE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	// public ResponseEntity<void> deleteReservation(
	// @PathParam(value="idReservation")
	// Long idReservation){
	//
	// return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	//
	//
	// }

}
