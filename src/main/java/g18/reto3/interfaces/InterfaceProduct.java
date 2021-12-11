package g18.reto3.interfaces;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import g18.reto3.modelo.ModeloProduct;

public interface InterfaceProduct extends MongoRepository <ModeloProduct, Integer> {
    Optional<ModeloProduct> findByReference(String reference);
    Optional<ModeloProduct> findByReferenceAndDescription(String reference, String description);
}
