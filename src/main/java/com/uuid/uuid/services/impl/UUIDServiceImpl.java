package com.uuid.uuid.services.impl;

import com.uuid.uuid.dto.IdToUUID;
import com.uuid.uuid.services.UUIDService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UUIDServiceImpl implements UUIDService {

    @Override
    public IdToUUID getRandomUUID() throws Exception {
        UUID uuid = UUID.randomUUID();
        IdToUUID idToUUID = new IdToUUID(uuid.toString());
        return idToUUID;
    }
}
