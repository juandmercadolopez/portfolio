package com.portfolio.demo.repository;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.portfolio.demo.entity.Portfolio;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Serializable>{
	
	@Transactional
	@Modifying
	@Query("UPDATE Portfolio p SET p.imageUrl = :imageUrl WHERE p.idPortfolio = 2001")
	public int updateImagePortfolio(@Param("imageUrl") String imageUrl);
	
	@Transactional
	@Modifying
	@Query("UPDATE Portfolio p SET p.title = :title, p.description = :description WHERE p.idPortfolio = 2001")
	public int updateDataPortfolio(@Param("title") String title, @Param("description") String description);
	
	public abstract Portfolio findByIdPortfolio(int id);

}
