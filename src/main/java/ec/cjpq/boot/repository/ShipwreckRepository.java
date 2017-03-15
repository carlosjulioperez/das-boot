package ec.cjpq.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.cjpq.boot.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}

