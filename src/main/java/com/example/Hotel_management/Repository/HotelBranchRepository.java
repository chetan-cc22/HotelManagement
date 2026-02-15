package com.example.Hotel_management.Repository;

import com.example.Hotel_management.Entity.HotelBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HotelBranchRepository extends JpaRepository<HotelBranch,Long> {
}
