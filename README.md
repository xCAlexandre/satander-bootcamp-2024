# dio-api-restful
RESTFul Api criada para o ultimo desafio lab-dio do Santander Bootcamp 2024

## Principais Tecnologias

- **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece.
- **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração.
- **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL.
- **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece.
- **Railway**: Facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## Diagrama de Classes (Domínio da API)

``` mermaid
graph TD
  A[student]
  A1[personal_info]
  A2[school_info]
  A3[academic_info]
  
  A --> A1
  A --> A2
  A --> A3
  
  A1 --> B1[first_name]
  A1 --> B2[last_name]
  A1 --> B3[date_of_birth]
  A1 --> B4[gender]
  A1 --> B5[address]
  A1 --> B6[contact]
  A1 --> B7[emergency_contact]
  
  B5 --> C1[street]
  B5 --> C2[city]
  B5 --> C3[state]
  B5 --> C4[zip_code]
  
  B6 --> D1[phone]
  B6 --> D2[email]
  
  B7 --> E1[name]
  B7 --> E2[relationship]
  B7 --> E3[phone]
  
  A2 --> F1[grade]
  A2 --> F2[class]
  A2 --> F3[school_year]
  A2 --> F4[student_id]
  A2 --> F5[enrollment_date]
  
  A3 --> G1[gpa]
  A3 --> G2[favorite_subjects]
  A3 --> G3[extra_curricular_activities]
  
  G2 --> H1[Math]
  G2 --> H2[Science]
  
  G3 --> I1[Soccer]
  G3 --> I2[Robotics Club]
```
