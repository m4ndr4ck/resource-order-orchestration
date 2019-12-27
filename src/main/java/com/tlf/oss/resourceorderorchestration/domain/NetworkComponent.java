package com.tlf.oss.resourceorderorchestration.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

/**
 * Componente de Rede
 */
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class NetworkComponent {

    /**
     * Lista de componentes de rede
     */
    @Getter
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private STATUS status;

    public enum STATUS {
        ATIVADO, DESATIVADO, PENDENTE
    }

    /**
     * Cria uma {@link NetworkComponent} sem o ID.
     */
    public static NetworkComponent withoutId(
            String id, String name, STATUS status) {
        return new NetworkComponent(null , name, status);
    }


    /**
     * Cria uma {@link NetworkComponent} com ID.
     */
    public static NetworkComponent withId(
            String id,
            String  name,
            STATUS status) {
        return new NetworkComponent(id, name, status);
    }

    public Optional<String> getId(){
        return Optional.ofNullable(this.id);
    }

}