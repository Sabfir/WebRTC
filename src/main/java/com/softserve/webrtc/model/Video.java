package com.softserve.webrtc.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Video {
    @Id
    @GeneratedValue
    private long id;
}
