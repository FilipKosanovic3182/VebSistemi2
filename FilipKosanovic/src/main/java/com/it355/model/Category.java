/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;

/**
 *
 * @author Filip Wolve
 */

import java.util.ArrayList; 
import java.util.List;
import javax.persistence.CascadeType; 
import javax.persistence.Column; 
import javax.persistence.Entity; import javax.persistence.FetchType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.Id; import javax.persistence.OneToMany; import javax.persistence.Table;
@SuppressWarnings("unused") @Entity @Table(name = "categories") public class Category {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name = "id") private Integer id;
@Column(name = "name") private String name;
@Column(name = "enabled") private Boolean enabled;
public Category() {}
public Integer getId() { return id; }
public void setId(Integer id) { this.id = id; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public Boolean getEnabled() { return enabled; }
public void setEnabled(Boolean enabled) { this.enabled = enabled; }
@Override public String toString() { return name; }
}