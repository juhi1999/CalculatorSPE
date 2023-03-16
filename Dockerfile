

FROM openjdk:8
COPY ./target/CalculatorSPE-1.0-SNAPSHOT-shaded.jar ./
WORKDIR ./
CMD ["java", "-jar", "CalculatorSPE-1.0-SNAPSHOT-shaded.jar"]
