package com.example.mapping.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "artists")
public class Artist {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "artist_id")
  private long artistId;

  @Column(name = "name")
  private String name;

  @OneToMany(mappedBy = "artist")            // member entity에서 사용되는 필드명
  List<Member> members = new ArrayList<>();  // List 추가

  public Artist(String name) {
    this.name = name;
  }

  public void addMember(Member member) {     // member 추가를 위한 함수 생성
    members.add(member);
  }
}
