package com.tlf.oss.resourceorderorchestration.framework.adapters.out.persistence;

import java.util.List;

import com.tlf.oss.resourceorderorchestration.domain.NetworkComponent;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "networkccmponent")
@AllArgsConstructor
@NoArgsConstructor
public class NetworkComponentEntity {

    @Getter
    @Setter
    @Id
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String STATUS;


}