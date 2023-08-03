FROM jetty:11.0.12-jdk17-alpine

COPY target/oceanops-api.war /var/lib/jetty/webapps/oceanops-api-main.war

