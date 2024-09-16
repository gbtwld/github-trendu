package com.trendu.githubtrendu.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "github_repo")
@Getter @Setter
public class GithubRepo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "github_repo_id")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "summary", nullable = false)
    private String summary;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "crawl_date", nullable = false)
    private LocalDateTime crawlDate;
}
