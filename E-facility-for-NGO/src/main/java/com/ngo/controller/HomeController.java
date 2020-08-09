package com.ngo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/home","/"})
	public String home() {
		return "home";
	}

	@GetMapping("/donationClothes")
	public String donationClothes() {
		return "donationClothes";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/sponsorChild")
	public String sponsorChild() {
		return "sponsorChild";
	}

	@GetMapping("/pickupSchedule")
	public String pickupSchedule() {
		return "pickupSchedule";
	}
}