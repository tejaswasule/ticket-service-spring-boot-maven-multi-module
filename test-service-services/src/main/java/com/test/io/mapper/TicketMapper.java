package com.test.io.mapper;

import java.util.Date;
import java.sql.Timestamp;

import com.test.io.dto.Ticket;
import com.test.io.entity.TicketEntity;

public class TicketMapper {

	public static TicketEntity mapTicketDataToEntity(Ticket ticket) {
		Date date = new Date();
		TicketEntity ticketEntity = new TicketEntity();

		ticketEntity.setAssignedTo(null);

		ticketEntity.setAssignmentTime(null);

		ticketEntity.setClosingTime(null);

		ticketEntity.setCreatedBy(null);

		ticketEntity.setCreationTime(new Timestamp(date.getTime()));

		ticketEntity.setDescription(ticket.getDescription());

		ticketEntity.setSummary(ticket.getSummary());

		ticketEntity.setTicketID(null);

		ticketEntity.setType(ticket.getType());

		return ticketEntity;
	}

	public static TicketEntity assignTicket(TicketEntity ticketEntity, Long empID) {
		Date date = new Date();
		
		ticketEntity.setAssignedTo(empID);

		ticketEntity.setAssignmentTime(new Timestamp(date.getTime()));
		
		return ticketEntity;
	}
	public static TicketEntity closeTicket(TicketEntity ticketEntity) {
		Date date = new Date();
		
		ticketEntity.setClosingTime(new Timestamp(date.getTime()));

		ticketEntity.setCreatedBy(null);
		
		return ticketEntity;
	}
}
