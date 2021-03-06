package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.AddFuel;
import com.plasticon.erp.service.AddFuelService;

@RestController
@RequestMapping(value="/addfuel")
public class AddFuelController {
@Autowired
AddFuelService addFuelService;

@GetMapping(value="/getaddfuel")
public List<AddFuel> getaddFuelDetails(){
	return addFuelService.getAddFuelDetails();
}

@PostMapping(value="/saveaddfuel",consumes="application/json")
public void saveAddFuelDetails(@RequestBody AddFuel addFuel) {
	addFuelService.saveAddFuelDetails(addFuel);
}
@DeleteMapping(value="/deleteaddfuel/{Id}")
public void deleteAddFuelDetailsById(@PathVariable int fuelId) {
	addFuelService.deleteAddFuelDetailsById(fuelId);
}
}
