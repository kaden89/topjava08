package ru.javawebinar.topjava.service;

import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.service.baseClasses.UserServiceTest;

/**
 * Created by Денис on 07.10.2016.
 */
@ActiveProfiles(Profiles.SPRING_DATA_JPA)
public class SpringDataJpaUserServiceTest extends UserServiceTest {
}