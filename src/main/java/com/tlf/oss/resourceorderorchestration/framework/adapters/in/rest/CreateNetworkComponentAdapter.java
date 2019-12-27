package com.tlf.oss.resourceorderorchestration.framework.adapters.in.rest;

import com.tlf.oss.resourceorderorchestration.application.queries.GetNetworkComponentQuery;
import com.tlf.oss.resourceorderorchestration.application.queries.GetNetworkComponentQuery.GetNetworkComponentCommand;
import com.tlf.oss.resourceorderorchestration.application.usecases.CreateNetworkComponentUseCase;
import com.tlf.oss.resourceorderorchestration.application.usecases.CreateNetworkComponentUseCase.CreateNetworkComponentCommand;
import com.tlf.oss.resourceorderorchestration.domain.NetworkComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class CreateNetworkComponentAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateNetworkComponentAdapter.class);

    private final CreateNetworkComponentUseCase createNetworkComponentUseCase;
    private final GetNetworkComponentQuery getNetworkComponentQuery;

    @PostMapping("/v1/createnetworkcomponent")
    public NetworkComponent createNetworkComponent(@RequestBody NetworkComponent networkComponent) {
        LOGGER.info("Criação de componente de rede: {}", networkComponent);

        CreateNetworkComponentCommand command = new CreateNetworkComponentCommand(
                networkComponent
        );

        return createNetworkComponentUseCase.createNetworkComponent(command);
    }

    @GetMapping("/v1/getnetworkcomponent/{componentId}")
    public NetworkComponent getNetworkComponent(@PathVariable("componentId") String id) {
        LOGGER.info("Obtendo de componente de rede : {}", id);

        GetNetworkComponentCommand command = new GetNetworkComponentQuery.GetNetworkComponentCommand(id);

        return  getNetworkComponentQuery.getNetworkComponent(command);
    }

}
