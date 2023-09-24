package com.fh.sensorapiapp.service.util;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "custom_sequences")
public class CustomSequences {

    @Id
    private String id;
    private long seq;
}
