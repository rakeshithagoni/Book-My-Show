
package com.example.Book_My_Show_Application.Repository;

import com.example.Book_My_Show_Application.Entities.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}