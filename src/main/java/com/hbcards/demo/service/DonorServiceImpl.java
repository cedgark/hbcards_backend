package com.hbcards.demo.service;

import com.hbcards.demo.model.Donor;
import com.hbcards.demo.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorServiceImpl implements DonorService {
    @Autowired
    private DonorRepository donorRepository;

    @Override
    public void addDonor(Donor donor) {
        donorRepository.save(donor);
    }

    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

}
