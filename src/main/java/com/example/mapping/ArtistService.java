package com.example.mapping;

import com.example.mapping.entity.Artist;
import com.example.mapping.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@RequiredArgsConstructor
@Service
public class ArtistService {

  @PersistenceContext
  private final EntityManager entityManager;

  @Transactional
  public void createArtist() {
    Artist artist = new Artist("New Jeans");
    entityManager.persist(artist);

    Member minji = new Member("Minji", "vocal", artist.getArtistId());
    entityManager.persist(minji);

    Member hanni = new Member("Hanni", "vocal", artist.getArtistId());
    entityManager.persist(hanni);

    Member danielle = new Member("Danielle", "vocal", artist.getArtistId());
    entityManager.persist(danielle);

    Member haerin = new Member("Haerin", "vocal", artist.getArtistId());
    entityManager.persist(haerin);

    Member hyein = new Member("Hyein", "vocal", artist.getArtistId());
    entityManager.persist(hyein);
  }
}
