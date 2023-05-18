FROM tomcat:8.0

ADD ./dist/12.war  /usr/local/tomcat/webapps/
