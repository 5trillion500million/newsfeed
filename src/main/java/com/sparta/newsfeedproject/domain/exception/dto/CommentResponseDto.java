package com.sparta.newsfeedproject.domain.exception.dto;

import com.sparta.newsfeedproject.domain.member.entity.Member;
import com.sparta.newsfeedproject.domain.news.entity.News;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
@Builder
@Getter
@AllArgsConstructor
public class CommentResponseDto {
    private Long id;
    private String message;
}
