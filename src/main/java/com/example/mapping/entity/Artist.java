package com.example.mapping.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


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

  @OneToMany
  @JoinColumn(name = "artist_id", updatable = false)
  List<Member> members = new ArrayList<>();

  public Artist(String name) {
    this.name = name;
  }

  public void addMember(Member member) {
    this.members.add(member);
  }
}
