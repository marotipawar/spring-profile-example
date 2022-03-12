package com.maroti.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mysql")
public abstract class StudentMySqlRepository implements StudentRepository{
}
