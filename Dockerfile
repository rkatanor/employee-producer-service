From tomcat:8.0.51-jre8-alpine
RUN rm -rf /usr/local/tomcat/webapps/*
COPY .target/employee-producer-service-0.0.1-SNAPSHOT /usr/local/tomcat/webapps/emp.war
CMD ["catalina.sh","run"]