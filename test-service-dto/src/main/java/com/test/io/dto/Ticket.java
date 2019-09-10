package com.test.io.dto;

import java.sql.Timestamp;

public class Ticket {
	public Long ticketID; 
	public String summary;
	public String description;
	public String type; 
	public Long createdBy;
	public Timestamp creationTime;
	public Long assignedTo; 
	public Timestamp assignmentTime;
	public Timestamp closingTime;
	public Long getTicketID() {
		return ticketID;
	}
	public void setTicketID(Long ticketID) {
		this.ticketID = ticketID;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}
	public Long getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(Long assignedTo) {
		this.assignedTo = assignedTo;
	}
	public Timestamp getAssignmentTime() {
		return assignmentTime;
	}
	public void setAssignmentTime(Timestamp assignmentTime) {
		this.assignmentTime = assignmentTime;
	}
	public Timestamp getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(Timestamp closingTime) {
		this.closingTime = closingTime;
	}
	
	
	
}
