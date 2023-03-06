
package com.example.Book_My_Show_Application.convertors;

import com.example.Book_My_Show_Application.Entities.TheaterEntity;
import com.example.Book_My_Show_Application.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}