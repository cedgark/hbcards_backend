package com.hbcards.demo.controller;

import com.hbcards.demo.model.Donor;
import com.hbcards.demo.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/donor")
@CrossOrigin
public class DonorController {
    @Autowired
    private DonorService donorService;

    @PostMapping(path="/add")
    public String addDonor(@RequestBody Donor donor) {
        donorService.addDonor(donor);
        return "The donor was added to the database";
    }

    @GetMapping(path="/getAll")
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }


}
