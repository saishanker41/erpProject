package com.plasticon.erp.model;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "staff_attendance")

public class StaffAttendance {
	@Id
	private int saId;
	private Date dateAttendanceOn;
	private Time inTime;
	private Time outTime;
	private String autoFill;

}
