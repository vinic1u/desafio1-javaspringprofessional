# Resumo do Projeto
### DESAFIO: Componentes e injeção de dependência
Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem
de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor
básico do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte:

| **Valor básico do pedido (sem desconto)** | **Frete**        |
|-------------------------------------------|------------------|
| Abaixo de R$ 100,00                        | R$ 20,00         |
| De R$ 100,00 até R$ 200,00 (exclusive)     | R$ 12,00         |
| R$ 200,00 ou mais                          | Grátis           |

### Exemplos


| **ENTRADA**                               | **SAÍDA**                         |
|-------------------------------------------|-----------------------------------|
| **Dados do Pedido**                       | **Resultado**                     |
| Código: 1034                              | Pedido código 1034                |
| Valor Básico: R$ 150,00                   | Valor total: R$ 132,00            |
| Porcentagem de Desconto: 20.0%            |                                   |

| **ENTRADA**                               | **SAÍDA**                         |
|-------------------------------------------|-----------------------------------|
| **Dados do Pedido**                       | **Resultado**                     |
| Código: 2282                              | Pedido código 2282                |
| Valor Básico: R$ 800,00                   | Valor total: R$ 720,00            |
| Porcentagem de Desconto: 10.0%            |                                   |

| **ENTRADA**                               | **SAÍDA**                         |
|-------------------------------------------|-----------------------------------|
| **Dados do Pedido**                       | **Resultado**                     |
| Código: 1309                              | Pedido código 1309                |
| Valor Básico: R$ 95,90                    | Valor total: R$ 115,90            |
| Porcentagem de Desconto: 0.0%             |                                   |



# Especificações

Sua solução deverá seguir as seguintes especificações:
Um pedido deve ser representado por um objeto conforme projeto abaixo:
```
+----------------------+
|        Order         |
+----------------------+
| - code : Integer     |
| - basic : Double     |
| - discount : Double  |
+----------------------+
```
A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada
um com sua responsabilidade, conforme projeto abaixo:
```
+--------------------------------+
|        OrderService            |
+--------------------------------+  
| + total(order: Order) : double |
+--------------------------------+
                ↓
+-----------------------------------+
|        ShippingService            |
+-----------------------------------+
| + shipment(order: Order) : double |
+-----------------------------------+
```
### Serviço OrderService:
responsável por operações referentes a pedidos.
### Serviço ShippingService: 
responsável por operações referentes a frete.
### Entrega
Sua solução deverá ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log do terminal da aplicação. Cada serviço deve ser implementado como um componente registrado com @Service.





