package com.test.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.io.entity.TicketEntity;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity,Long>  {

}
