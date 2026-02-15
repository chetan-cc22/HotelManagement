package com.example.Hotel_management.Service;

import com.example.Hotel_management.Entity.Hotel;
import com.example.Hotel_management.Entity.HotelBranch;
import com.example.Hotel_management.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public Hotel saveHotel(Hotel hotel) {

        // connection branch and hotel ka
        if (hotel.getBranches() != null) {
            for (HotelBranch branch : hotel.getBranches()) {
                branch.setHotel(hotel);
            }
        }

        return hotelRepository.save(hotel);
    }

    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }
}
