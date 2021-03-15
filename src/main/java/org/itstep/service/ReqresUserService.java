package org.itstep.service;

import org.itstep.data.Datum;

import java.util.List;
import java.util.Optional;

public interface ReqresUserService {
    List<Datum> getAllUsers();

    Optional<Datum>  getById();

}
