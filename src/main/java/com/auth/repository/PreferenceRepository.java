package com.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.model.UserPreference;

@Repository
public interface PreferenceRepository extends JpaRepository<UserPreference, Long> {

}
