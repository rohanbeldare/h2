package com.h2.h2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2.h2.domain.Candidate;
import com.h2.h2.service.CandidateService;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

	@Autowired
	private CandidateService candidateService;
	
	
	@GetMapping
	public List<Candidate> getAll(){
		return candidateService.getAll();
	}
	
	@PostMapping
	public Candidate createCandidate(@RequestBody Candidate candidate) {
		return candidateService.createCandidate(candidate);
	}
	
}
