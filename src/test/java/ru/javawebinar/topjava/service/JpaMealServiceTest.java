package ru.javawebinar.topjava.service;

import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.service.baseClasses.MealServiceTest;

/**
 * Created by Денис on 07.10.2016.
 */
@ActiveProfiles(Profiles.JPA)
public class JpaMealServiceTest extends MealServiceTest {
}