package com.corujito.champz.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.corujito.champz.rest.repository.entity.AttendanceEntity;

public interface IAttendanceRepository extends MongoRepository<AttendanceEntity, String> {

}
