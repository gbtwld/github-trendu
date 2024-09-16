package com.trendu.githubtrendu.repository;

import com.trendu.githubtrendu.domain.GithubRepo;
import jakarta.persistence.EntityManager;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class JpaGithubReposRepository implements GithubReposRepository{

    private final EntityManager entityManager;

    public JpaGithubReposRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public GithubRepo save(GithubRepo repo) {
        entityManager.persist(repo);
        return repo;
    }

    @Override
    public Optional<GithubRepo> findById(Long id) {
        GithubRepo repo = entityManager.find(GithubRepo.class, id);
        return Optional.ofNullable(repo);
    }

    @Override
    public Optional<GithubRepo> findByTitle(String title) {
        List<GithubRepo> result = entityManager.createQuery("select m from GithubRepo m where m.title = :title", GithubRepo.class).setParameter("title", title).getResultList();

        return result.stream().findAny();
    }

    @Override
    public List<GithubRepo> findByDateBetween(LocalDateTime start, LocalDateTime end) {
        return List.of();
    }

    @Override
    public List<GithubRepo> findAll() {
        return List.of();
    }
}
