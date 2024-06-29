package com.hbcards.demo.service;

import com.hbcards.demo.model.Donor;

import java.util.List;


public interface DonorService {

    void addDonor(Donor donor);

    List<Donor> getAllDonors();
}
