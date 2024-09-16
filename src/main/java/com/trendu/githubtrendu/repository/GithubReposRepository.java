package com.trendu.githubtrendu.repository;

import com.trendu.githubtrendu.domain.GithubRepo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface GithubReposRepository {
    GithubRepo save(GithubRepo repo);

    Optional<GithubRepo> findById(Long id);

    Optional<GithubRepo> findByTitle(String title);

    List<GithubRepo> findByDateBetween(LocalDateTime start, LocalDateTime end);

    List<GithubRepo> findAll();
}
