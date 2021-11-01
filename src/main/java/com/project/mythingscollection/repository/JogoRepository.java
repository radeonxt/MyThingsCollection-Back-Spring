package com.project.mythingscollection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.mythingscollection.domain.Jogo;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Integer> {

}
