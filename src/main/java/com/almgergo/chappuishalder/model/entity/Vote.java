package com.almgergo.chappuishalder.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Vote entity
 */
@Entity
@Data
@Builder
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Value of the vote on a scale of 0-10
     */
    private Double value;

    private String articleUrl;
}
