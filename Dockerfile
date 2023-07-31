FROM jetty:11.0.12-jdk17-alpine

ENV JAVA_OPTIONS="--add-exports java.base/sun.security.action=ALL-UNNAMED -Duser.timezone=UTC -Dcayenne.jdbc.driver=$DB_DRIVER -Dcayenne.jdbc.url=$DB_URL -Dcayenne.jdbc.username=$DB_USERNAME -Dcayenne.jdbc.password=$DB_PASSWORD"

COPY target/oceanops-api.war /var/lib/jetty/webapps/oceanops-api.war

