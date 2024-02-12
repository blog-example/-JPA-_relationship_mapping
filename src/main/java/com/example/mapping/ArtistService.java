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

    Member minji = new Member("Minji", "vocal", newJeans.getArtistId());
    entityManager.persist(minji);
    newJeans.addMember(minji);

    Member hanni = new Member("Hanni", "vocal", newJeans.getArtistId());
    entityManager.persist(hanni);
    newJeans.addMember(hanni);

    Member danielle = new Member("Danielle", "vocal", newJeans.getArtistId());
    entityManager.persist(danielle);
    newJeans.addMember(danielle);

    Member haerin = new Member("Haerin", "vocal", newJeans.getArtistId());
    entityManager.persist(haerin);
    newJeans.addMember(haerin);

    Member hyein = new Member("Hyein", "vocal", newJeans.getArtistId());
    entityManager.persist(hyein);
    newJeans.addMember(hyein);


  }
}
