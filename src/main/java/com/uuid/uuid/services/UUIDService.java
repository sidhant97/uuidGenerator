package com.uuid.uuid.services;

import com.uuid.uuid.dto.IdToUUID;

public interface UUIDService {

    IdToUUID getRandomUUID() throws Exception;
}
