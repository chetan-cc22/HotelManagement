package com.example.Hotel_management.Controller;

import com.example.Hotel_management.Entity.Hotel;
import com.example.Hotel_management.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private final HotelService service;

    public HotelController(HotelService service) {
        this.service = service;
    }

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return service.saveHotel(hotel);
    }

    @GetMapping
    public List<Hotel> getHotels() {
        return service.getHotels();
    }
}
