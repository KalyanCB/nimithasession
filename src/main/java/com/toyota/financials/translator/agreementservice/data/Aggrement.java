package com.toyota.financials.translator.agreementservice.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "aggrement")
@Data
public class Aggrement {

    @Id
    private Integer aggrementNo;


}
