package com.monpro.passbook.dao;

import com.monpro.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <h1>Merchants Dao interface</h1>
 * Created by monpro.
 */
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {

    /**
     * <h2>get merchant object by id</h2>
     * @param id merchants id
     * @return {@link Merchants}
     * */
    Merchants findById(Integer id);

    /**
     * <h2>get merchant object by name</h2>
     * @param name merchants name
     * @return {@link Merchants}
     * */
    Merchants findByName(String name);

    /**
     * <h2>get merchant object by ids</h2>
     * @param ids merchants ids
     * @return {@link Merchants}
     * */
    List<Merchants> findByIdIn(List<Integer> ids);
}
