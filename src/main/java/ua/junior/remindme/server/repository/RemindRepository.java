package ua.junior.remindme.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.junior.remindme.server.entity.Recipe;

/**
 * Created by lenin on 25.02.2016.
 */
public interface RemindRepository extends JpaRepository<Recipe, Long> {

}
