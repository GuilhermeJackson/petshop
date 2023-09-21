 # Microservices Project - Petshop 
Este repositório contém um projeto de microsserviços que inclui os seguintes componentes:

 - Este repositório contém um projeto de microsserviços que inclui os seguintes componentes:
 - Eureka: Registrador de serviços para facilitar a descoberta de outros microsserviços.
 - Zuul: Gateway de API para roteamento e proteção de serviços.
 - Controlador de Animais: Microsserviço responsável por lidar com informações relacionadas a animais.
 - Controlador de Animais: Microsserviço responsável por lidar com informações relacionadas a animais.


 Certifique-se de que você tenha Java 11 instaldo na sua máquina

 
 ## Executando a Aplicação
  Siga as etapas abaixo para executar a aplicação de microsserviços:
 #### 1 - Config Server: 
 Navegue até a pasta config-server e execute o seguinte comando:
 
 `` 
 cd microservicos/config-server 
 `` 
 
 `` 
 java -jar config-server.jar 
 `` 
 #### 2 - Eureka: 
 Navegue até a pasta eureka e execute o seguinte comando:
 
 `` 
 cd microservicos/eureka 
 `` 
 
 `` 
 java -jar eureka.jar 
 `` 
 
 #### 3 - Zuul: 
 Navegue até a pasta zuul e execute o seguinte comando:
 
 `` 
cd microsservicos/zuul
 `` 
 
 `` 
java -jar zuul.jar
 `` 

  #### 4 - Controladores: 
a. Para o microsserviço de Controlador de Animais, navegue até a pasta controlador-animais-ms e execute o seguinte comando:

 `` 
cd microsservicos/controlador-animais-ms
 `` 
 
 `` 
java -jar controlador-animais-ms.jar
 `` 

 b. Para o microsserviço de Controlador de Pessoas, navegue até a pasta controlador-pessoas-ms e execute o seguinte comando:
 
  `` 
cd microsservicos/controlador-pessoas-ms
 `` 
 
 `` 
java -jar controlador-pessoas-ms.jar
 `` 

 Após seguir todas essas etapas, seus microsserviços devem estar em execução.

 ## API

#### Controlador de animais
Tipo Integer dono;

Tipo Integer id;

- Base URL: http://localhost:8011/api/animais
- Verificar status do serviço: http://localhost:8011/api/animais/status
- Criar um novo animal: [POST] http://localhost:8011/api/animais
- Obter todos os animais: [GET] http://localhost:8011/api/animais
- Obter animais por dono: [GET] http://localhost:8011/api/animais/{dono}/lista
- Obter animal por ID: [GET] http://localhost:8011/api/animais/{id}
- Atualizar um animal: [PUT] http://localhost:8011/api/animais/{id}
- Remover um animal: [DELETE] http://localhost:8011/api/animais/{id}
- Definir animal como morto: [PATCH] http://localhost:8011/api/animais/{id}



#### Controlador de Pessoas:
Tipo Integer id;

- Base URL: http://localhost:8011/api/pessoas
- Verificar status do serviço: http://localhost:8011/api/pessoas/status
- Criar uma nova pessoa: [POST] http://localhost:8011/api/pessoas
- Obter todas as pessoas: [GET] http://localhost:8011/api/pessoas
- Obter pessoa por ID: [GET] http://localhost:8011/api/pessoas/{id}
- Atualizar uma pessoa: [PUT] http://localhost:8011/api/pessoas/{id}
- Remover uma pessoa: [DELETE] http://localhost:8011/api/pessoas/{id}

#### Eureka:
URL do Eureka Dashboard: http://localhost:8010
