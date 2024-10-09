package com.compassuol.course.repositories;

import com.compassuol.course.entities.Category;
import com.compassuol.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
