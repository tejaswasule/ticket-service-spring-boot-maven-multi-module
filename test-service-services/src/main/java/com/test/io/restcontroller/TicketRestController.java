package com.test.io.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.io.dto.Ticket;
import com.test.io.exceptions.TicketNotFoundException;
import com.test.io.interfaces.TicketService;

@RestController
public class TicketRestController {
	
	@Autowired
	TicketService ticketService;
	
	/**
	 * Method to create ticket
	 * 
	 * @param ticket
	 */
	@RequestMapping(value = "/create-ticket", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public void createTicket(@RequestBody Ticket ticket) {
		ticketService.createTicket(ticket);
	}

	/**
	 * Method to assign ticket
	 * @param ticketId
	 * @param emloyeeID
	 */
	@RequestMapping(value="/assign-ticket/{ticketId}/{emloyeeID}", method = RequestMethod.GET)
	public void assignTicket(@PathVariable(value = "ticketId") String ticketId,
			@PathVariable(value = "emloyeeID") String emloyeeID) {
		ticketService.assignTicket(Long.parseLong(ticketId), Long.parseLong(emloyeeID));
	}

	/**
	 * Method to close ticket
	 * @param ticketId
	 * @throws TicketNotFoundException 
	 * @throws NumberFormatException 
	 */
	@RequestMapping(value="/close-ticket/{ticketId}", method = RequestMethod.GET)
	public void closeTicket(@PathVariable(value = "ticketId") String ticketId) throws NumberFormatException, TicketNotFoundException {
		ticketService.closeTicket(Long.parseLong(ticketId));
	}

	/**
	 * Method to find pending tickets by Dept
	 * @param deptID
	 */
	@RequestMapping(value = "/find-pending-tickets-by-dept/{deptID}" , method = RequestMethod.GET)
	public void findPendingTickletsByDept(@PathVariable(value = "deptID") String deptID) {
		ticketService.findPendingTickletsByDept(Long.parseLong(deptID));
	}

	/**
	 * Method to find pending tickets by Manager
	 * @param employeeID
	 */
	@RequestMapping(value="/find-pending-tickets-by-manager/{employeeID}", method = RequestMethod.GET)
	public void findPendingTickletsByManager(@PathVariable(value = "employeeID") String employeeID) {
		ticketService.findPendingTickletsByManager(Long.parseLong(employeeID));
	}
	/**
	 * Method to find all tickets
	 */
	@RequestMapping(value="/find-all-tickets",  method = RequestMethod.GET)
	public String findAllTicklets(){
		return ticketService.findAllTicklets();
	}

}
