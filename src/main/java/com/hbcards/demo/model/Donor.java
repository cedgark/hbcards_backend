package com.hbcards.demo.model;

import jakarta.persistence.*;

@Entity
public class Donor {
    @Id
    @SequenceGenerator(
            name="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private Long id;
    private String donorName;
    private String donorEmail;
    private String recipientName;

    public Donor() {
    }

    public Donor(String donorName, String donorEmail, String recipientName) {
        this.donorName = donorName;
        this.donorEmail = donorEmail;
        this.recipientName = recipientName;
    }
    public Donor(Long id, String donorName, String donorEmail, String recipientName) {
        this.id = id;
        this.donorName = donorName;
        this.donorEmail = donorEmail;
        this.recipientName = recipientName;
    }

    public Long getId() {
        return id;
    }

    public String getDonorName() {
        return donorName;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "id=" + id +
                ", donorName='" + donorName + '\'' +
                ", donorEmail='" + donorEmail + '\'' +
                ", recipientName='" + recipientName + '\'' +
                '}';
    }
}
