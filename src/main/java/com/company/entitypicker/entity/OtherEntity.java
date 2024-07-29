package com.company.entitypicker.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "OTHER_ENTITY", indexes = {@Index(name = "IDX_OTHER_ENTITY_USER", columnList = "USER_ID")})
@Entity
public class OtherEntity
{
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "USER_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private User userID;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public User getUserID() {return userID;}

    public void setUserID(User userID) {this.userID = userID;}

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}
}