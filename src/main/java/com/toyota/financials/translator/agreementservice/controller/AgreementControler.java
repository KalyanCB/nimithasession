package com.toyota.financials.translator.agreementservice.controller;

import com.toyota.financials.translator.agreementservice.data.Aggrement;
import com.toyota.financials.translator.agreementservice.data.AggrementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController()
public class AgreementControler {

    @Autowired
    AggrementRepository aggrementRepository;

    @PostMapping("/agreement")
    public String getAgreementNo(@RequestBody Map<String,Object> request){

        Aggrement ag = new Aggrement();
        ag.setAggrementNo(6000000);
        aggrementRepository.save(ag);

        return "0000001";
    }

}
