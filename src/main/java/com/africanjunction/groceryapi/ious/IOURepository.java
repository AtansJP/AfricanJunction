package com.AfricanJunction.groceryapi.ious;

import org.springframework.data.repository.ListCrudRepository;
import java.util.UUID;

public interface IOURepository extends ListCrudRepository<IOU, UUID> {
}
