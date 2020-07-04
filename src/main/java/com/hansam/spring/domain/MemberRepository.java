package com.hansam.spring.domain;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hansam.spring.domain.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
	Optional<MemberEntity> findByEmail(String userEmail);
}
