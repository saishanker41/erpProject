package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Session;
@Repository
public interface SessionRepository extends JpaRepository<Session,Integer> {

}
