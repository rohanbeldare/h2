package com.h2.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.h2.h2.domain.Candidate;
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

}
