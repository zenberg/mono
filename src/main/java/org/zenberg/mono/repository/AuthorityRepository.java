package org.zenberg.mono.repository;

import java.util.List;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.zenberg.mono.domain.Authority;

/**
 * Spring Data Neo4j repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends Neo4jRepository<Authority, String> {
    // See https://github.com/neo4j/sdn-rx/issues/51    List<Authority> findAll();

}
