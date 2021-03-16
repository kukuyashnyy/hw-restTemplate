package org.itstep.service;

import org.itstep.data.Datum;
import org.itstep.data.ReqresUserApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@PropertySource("classpath:config.properties")
public class ReqresUserServiceImpl implements ReqresUserService {

    @Value("${dataUrl}")
    private String dataUrl;

    private final RestTemplate restTemplate;

    public ReqresUserServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public List<Datum> getAllUsers() {
        ResponseEntity<ReqresUserApi> forEntity = restTemplate.getForEntity(dataUrl, ReqresUserApi.class);
        return forEntity.getBody().getData();
    }

    @Override
    public Optional<Datum> getById() {
        return Optional.empty();
    }
}
