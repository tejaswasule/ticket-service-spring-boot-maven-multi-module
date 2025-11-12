package com.test.io.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.io.dto.Ticket;
import com.test.io.entity.TicketEntity;
import com.test.io.exceptions.TicketNotFoundException;
import com.test.io.interfaces.TicketService;
import com.test.io.mapper.TicketMapper;
import com.test.io.repository.DepartmentRepository;
import com.test.io.repository.EmployeeRepository;
import com.test.io.repository.TicketRepository;

@Component
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	
	@Override
	public void createTicket(Ticket ticket) {
		
		TicketEntity ticketEntity = TicketMapper.mapTicketDataToEntity(ticket);
		ticketRepository.saveAndFlush(ticketEntity);
		
	}

	@Override
	public void assignTicket(Long ticketId, Long emloyeeID) {
		Optional<TicketEntity> ticketEntity = ticketRepository.findById(ticketId);
		ticketRepository.saveAndFlush(TicketMapper.assignTicket(ticketEntity.get(), emloyeeID));
	}
	public void getTicket(Long ticketId, Long emloyeeID) {
		//do nothing
	}

	@Override
	public void closeTicket(Long ticketId) throws TicketNotFoundException {
		try{
			Optional<TicketEntity> ticketEntity = ticketRepository.findById(ticketId);
			ticketRepository.saveAndFlush(TicketMapper.closeTicket(ticketEntity.get()));
		}catch(Exception ex) {
			throw new TicketNotFoundException("Ticket Not Found");
		}
		
	}

	@Override
	public List<Ticket> findPendingTickletsByDept(Long deptID) {
		return null;
	}

	@Override
	public void findPendingTickletsByManager(Long employeeID) {
		System.out.println("findPendingTickletsByManager -->" + employeeID);
		
	}

	@Override
	public String findAllTicklets() {
		List<TicketEntity> list = ticketRepository.findAll();
		return list.toString();
	}

}
