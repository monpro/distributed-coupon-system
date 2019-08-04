package com.monpro.passbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <h1>商户对象模型</h1>
 * Created by monpro.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {

    /** Merchants id, primary key */
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    /** Merchants name, need globally unique */
    @Basic
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Basic
    @Column(name = "logo_url", nullable = false)
    private String logoUrl;

    @Basic
    @Column(name = "business_license_url", nullable = false)
    private String businessLicenseUrl;

    @Basic
    @Column(name = "phone", nullable = false)
    private String phone;

    @Basic
    @Column(name = "address", nullable = false)
    private String address;

    @Basic
    @Column(name = "is_audit", nullable = false)
    private Boolean isAudit = false;
}
