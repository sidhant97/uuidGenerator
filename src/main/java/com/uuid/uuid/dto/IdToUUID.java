package com.uuid.uuid.dto;

import lombok.Data;

@Data
public class IdToUUID {

    private String id;

    public IdToUUID(String id){
        this.id = id;
    }
}
