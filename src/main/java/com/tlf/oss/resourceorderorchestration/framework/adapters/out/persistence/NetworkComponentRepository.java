package com.tlf.oss.resourceorderorchestration.framework.adapters.out.persistence;

import org.springframework.data.repository.CrudRepository;


interface NetworkComponentRepository extends CrudRepository<NetworkComponentEntity, String> {

    NetworkComponentEntity getOrderMongoEntityById(String id);

}
