package com.food.foodspringApp.reposetory;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodspringApp.dto.Iteam;

public interface IteamRepo extends JpaRepository<Iteam,Integer>{

}
