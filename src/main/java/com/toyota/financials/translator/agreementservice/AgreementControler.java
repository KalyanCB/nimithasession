package com.toyota.financials.translator.agreementservice;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController()
public class AgreementControler {

    @PostMapping("/agreement")
    public String getAgreementNo(@RequestBody Map<String,Object> request){
        return "kalyan";
    }

}
