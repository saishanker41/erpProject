package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="manage_payment_gateway")
public class ManagePaymentGateWay {
	@Id
private int managePaymentGateWayId;
	private String userName;
	private String password;
	private int reqHashKey;
	private int respHashKey;
	private int productId;
	private String account;
	private String status;
}
