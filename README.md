** 1. Start Spring Cloud Config server
`spring run config.groovy -- --server.port=8888 --spring.profiles.active=native`

** 2. Start Eureka server
`spring run eureka-server.groovy -- --spring.application.name=eureka-server`

** 3. Start Zuul proxy server
`spring run zuul.groovy -- --spring.application.name=zuul`