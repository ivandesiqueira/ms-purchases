package com.ms.purchases.services;

import com.ms.purchases.models.Request;
import com.ms.purchases.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    RequestRepository requestRepository;

    public Request saveRequest(Request request) {
        return requestRepository.save(request);
    }
}
