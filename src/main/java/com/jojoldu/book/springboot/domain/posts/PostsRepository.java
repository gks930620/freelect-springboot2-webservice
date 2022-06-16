package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query(value = "SELECT * FROM posts p ORDER BY p.id DESC", nativeQuery = true)  //JPA라고 쿼리안쓰는거 아님. 제공안해주는 쿼리는 이렇게 따로 쓰면 됌.
    List<Posts> findAllDesc();
}