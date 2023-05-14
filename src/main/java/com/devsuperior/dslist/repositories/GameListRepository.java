/**
 * 
 */
package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

/**
 * @author jemsa
 *
 */
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
