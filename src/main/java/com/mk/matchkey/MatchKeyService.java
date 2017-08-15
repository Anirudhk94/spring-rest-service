package com.mk.matchkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mk.matchkey.MatchKey;
import com.mk.matchkey.MatchKeyRepository;

@Service
public class MatchKeyService {
	private MatchKeyRepository matchKeyRepository;
	
	@Autowired
	public MatchKeyService(MatchKeyRepository matchKeyRepository) {
		this.matchKeyRepository = matchKeyRepository;
	}
	
	public MatchKey createMatchKey(int i, String name, String description, String validity) {
		if(!matchKeyRepository.exists(i)) {
			matchKeyRepository.save(new MatchKey(i, name, description, validity));
		}
		return null;
		
	} 

	public Iterable<MatchKey> lookup() {
		return matchKeyRepository.findAll();
	}
	
	public long total() {
		return matchKeyRepository.count();
	}
	
}
