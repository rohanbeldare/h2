package com.h2.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.h2.domain.Candidate;
import com.h2.h2.repository.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository candidateRepository;
	
	
	public List<Candidate> getAll(){
		return candidateRepository.findAll();
	}


	public Candidate createCandidate(Candidate candidate) {
		return candidateRepository.save(candidate);
	}
}
