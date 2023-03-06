
package com.example.Book_My_Show_Application.convertors;

import com.example.Book_My_Show_Application.Entities.TicketEntity;
import com.example.Book_My_Show_Application.EntryDtos.TicketEntryDto;

public class TicketConvertors {


    public static TicketEntity convertEntryToEntity(TicketEntryDto ticketEntryDto){

        TicketEntity ticketEntity = new TicketEntity();
        return ticketEntity;

    }
}