package com.store.categorycrud.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.store.categorycrud.entities.Category;
import com.store.categorycrud.repositories.CategoryRepository;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CategoryResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    private final CategoryRepository categoryRepository;

    public List<Category> findAllCategories() {
        return this.categoryRepository.findAll();
    }

    public Category createCategory(final String code, final String name) {
        final Category entity = new Category();
        entity.setName(name);
        entity.setCode(code);
        return this.categoryRepository.save(entity);
    }
}