
package com.example.Book_My_Show_Application.Controller;

import jakarta.persistence.*;

import com.example.Book_My_Show_Application.EntryDtos.ShowEntryDto;
import com.example.Book_My_Show_Application.Services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    ShowService showService;

    @PostMapping("/add")
    public ResponseEntity<String> addShow(@RequestBody ShowEntryDto showEntryDto){

        return new ResponseEntity<>(showService.addShow(showEntryDto), HttpStatus.CREATED);

    }


}