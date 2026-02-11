package com.example.Hotel_management.Service;

import com.example.Hotel_management.Entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    private List<Hotel> hotels = new ArrayList<>();
    private Long idCounter = 1L;

    public Hotel addHotel(Hotel hotel) {
        hotel.setId(idCounter++);
        hotels.add(hotel);
        return hotel;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

}
