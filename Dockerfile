FROM tomcat:9-jre8-temurin
COPY target/bibliotheek-web.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]