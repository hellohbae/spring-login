package com.hansam.spring.domain;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
	Optional<MemberEntity> findByEmail(String userEmail);
}
