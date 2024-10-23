package com.sparta.newsfeedproject.domain.news.repository;

import com.sparta.newsfeedproject.domain.news.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    void deleteByMemberId(Long id);

    List<News> findByMemberIdIn(List<Long> friendIds);
}
