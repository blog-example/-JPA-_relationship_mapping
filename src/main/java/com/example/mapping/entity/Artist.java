package com.example.mapping.entity;

import jakarta.persistence.*;
import lombok.Getter;


@Getter
@Entity
@Table(name = "artists")
public class Artist {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "artist_id")
  private long artistId;

  @Column(name = "name")
  private String name;

  public Artist(String name) {
    this.name = name;
  }
}
