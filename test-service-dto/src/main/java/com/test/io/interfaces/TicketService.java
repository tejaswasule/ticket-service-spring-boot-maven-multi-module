package com.test.io.interfaces;



import java.util.List;

import com.test.io.dto.Ticket;
import com.test.io.exceptions.TicketNotFoundException;

public interface TicketService {
	/**
	 * Method to create ticket
	 * 
	 * @param ticket
	 */
	public void createTicket(Ticket ticket);
	
	
	/**
	 * Method to assign ticket
	 * @param ticketId
	 * @param emloyeeID
	 */
	
	public void assignTicket(Long ticketId,Long emloyeeID);
	
	/**
	 * Method to close ticket
	 * @param ticketId
	 * @throws com.test.io.exception.TicketNotFoundException 
	 */
	
	public void closeTicket(Long ticketId) throws TicketNotFoundException;
	
	/**
	 * Method to find pending tickets by Dept
	 * @param deptID
	 */
	public List<Ticket> findPendingTickletsByDept(Long deptID);
	/**
	 * Method to find pending tickets by Manager
	 * @param employeeID
	 */
	public void findPendingTickletsByManager(Long employeeID);
	/**
	 * Method to find all tickets
	 */
	public String findAllTicklets();
}
