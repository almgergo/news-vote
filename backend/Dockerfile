FROM gradle:jdk8 as builder

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:8-jdk-alpine
COPY --from=builder /home/gradle/src/build/libs/chappuis-halder-1.0.jar /opt/assets/chappuis-halder-1.0.jar
