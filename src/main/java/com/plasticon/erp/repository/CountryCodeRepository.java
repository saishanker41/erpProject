package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.CountryCode;

@Repository
public interface CountryCodeRepository extends JpaRepository<CountryCode,Number>{

}
