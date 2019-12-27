package com.tlf.oss.resourceorderorchestration.application.usecases;
import com.tlf.oss.resourceorderorchestration.framework.helpers.SelfValidating;
import com.tlf.oss.resourceorderorchestration.domain.NetworkComponent;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface CreateNetworkComponentUseCase {

    NetworkComponent createNetworkComponent(CreateNetworkComponentCommand command);
      @Value
    @EqualsAndHashCode(callSuper = false)
    class CreateNetworkComponentCommand extends SelfValidating<CreateNetworkComponentCommand> {

        @NotNull
        private final NetworkComponent networkComponent;

        public CreateNetworkComponentCommand(NetworkComponent networkComponent) {
            this.networkComponent = networkComponent;
            this.validateSelf();
        }
    }

}
