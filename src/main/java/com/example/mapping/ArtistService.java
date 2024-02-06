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
    Artist newJeans = new Artist("New Jeans");
    entityManager.persist(newJeans);

    Member minji = new Member("Minji", "vocal", newJeans);
    entityManager.persist(minji);

    Member hanni = new Member("Hanni", "vocal", newJeans);
    entityManager.persist(hanni);

    Member danielle = new Member("Danielle", "vocal", newJeans);
    entityManager.persist(danielle);

    Member haerin = new Member("Haerin", "vocal", newJeans);
    entityManager.persist(haerin);

    Member hyein = new Member("Hyein", "vocal", newJeans);
    entityManager.persist(hyein);
  }
}
