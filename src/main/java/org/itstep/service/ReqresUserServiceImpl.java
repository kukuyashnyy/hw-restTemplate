package org.itstep.service;

import org.itstep.data.Datum;
import org.itstep.data.ReqresUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@PropertySource("classpath:config.properties")
public class ReqresUserServiceImpl implements ReqresUserService {

    @Value("${dataUrl}")
    private String dataUrl;

    @Override
    public List<Datum> getAllUsers() {
        return null;
    }

    @Override
    public Optional<Datum> getById() {
        return Optional.empty();
    }
}
