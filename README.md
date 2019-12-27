# Resource Order Orchestration


Aplicação responsável por criar os componentes de rede que serão utilizados pelo Resource Order
na criação de ordens.

```
mvn clean package
```

```
docker build . -t oss/resource-order-orchestration:1.0 
```

```
kubectl apply -f k8s/deployment.yaml 
```

Exemplo de payload:

```
curl --header "Content-Type: application/json"   --request POST   --data '{"name":"vFirewall", "status":"ATIVADO"}'   http://services.oss.redecorp/resource-order-orchestration/v1/createnetworkcomponent
```

Resposta:
```
{"id":"5e05850bcc5ed83c81faa3c6","name":"vFirewall","status":"ATIVADO"}
```

**O ID deve ser utilizado como payload do Resource Order.**
