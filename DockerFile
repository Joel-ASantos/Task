FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

RUN apt-get update \
    && apt-get install -y maven \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -jar target/*.jar"]
