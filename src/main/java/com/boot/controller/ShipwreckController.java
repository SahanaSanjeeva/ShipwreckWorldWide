package com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Shipwreck;

@RestController
@RequestMapping("/api/v1/")
public class ShipwreckController {

	@RequestMapping(value = "Shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list() {
		return ShipwreckStub.list();
	}
}
