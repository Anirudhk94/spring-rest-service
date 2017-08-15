package com.mk.matchkey;

import org.springframework.data.repository.CrudRepository;

public interface MatchKeyRepository extends CrudRepository<MatchKey, Integer>{
	MatchKey findByName(String name);
}
