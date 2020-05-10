FROM java:8
WORKDIR /
ADD Calculator.jar Calculator.jar
EXPOSE 8080
CMD java - jar Calculator.jar
