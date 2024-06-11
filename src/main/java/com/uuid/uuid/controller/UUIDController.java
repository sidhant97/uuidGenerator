package com.uuid.uuid.controller;

import com.uuid.uuid.dto.IdToUUID;
import com.uuid.uuid.services.UUIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.uuidcontext}")
public class UUIDController {


    @Autowired
    private UUIDService uuidService;

    @GetMapping("/browse/v0/random/uuid")
    private ResponseEntity<IdToUUID> getRandomUUID() throws Exception {
        IdToUUID idToUUID = uuidService.getRandomUUID();
        return new ResponseEntity<>(idToUUID, HttpStatus.OK);
    }


}
