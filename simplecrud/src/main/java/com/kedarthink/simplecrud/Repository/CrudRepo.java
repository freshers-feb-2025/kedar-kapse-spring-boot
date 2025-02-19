package com.kedarthink.simplecrud.Repository;

import com.kedarthink.simplecrud.Entity.CrudEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepo extends JpaRepository<CrudEntity,Long> {
}
