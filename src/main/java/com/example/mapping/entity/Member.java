package com.example.mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "members")
public class Member {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "member_id")
  private long memberId;

  @Column(name = "name")
  private String name;

  @Column(name = "part")
  private String part;

  @Column(name = "artist_id")
  private long artistId;

  public Member(String name, String member, long artistId) {
    this.name = name;
    this.part = member;
    this.artistId = artistId;
  }
}
