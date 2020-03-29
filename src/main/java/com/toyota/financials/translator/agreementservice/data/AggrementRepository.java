package com.toyota.financials.translator.agreementservice.data;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AggrementRepository extends MongoRepository<Aggrement,Integer> {
}
