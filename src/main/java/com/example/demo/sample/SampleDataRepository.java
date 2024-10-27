package com.example.demo.sample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleDataRepository extends JpaRepository<SampleData, Integer> {
}
