This is a simple Spring Boot web app with Jetty 9 and Docker and this project can as well be deployed onto Google Cloud Kubernetes cluster.

To build and run locally, create a maven run configuration as below and run it...
clean package jetty:run -Dcheckstyle.skip

To run locally use: http://localhost:8080/hello

- In case you would like to push to Google Cloud Kubernetes Engine,
Use the URL as
	https://$$$$$/spring-boot-jetty-docker-web/hello (This is as specified in DockerFile)
	