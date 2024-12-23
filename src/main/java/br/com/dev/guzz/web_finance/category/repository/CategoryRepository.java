package br.com.dev.guzz.web_finance.category.repository;

import br.com.dev.guzz.web_finance.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByIdAndActive(Long id, boolean active);
}