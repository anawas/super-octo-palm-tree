ARG VERSION=17.0.9
FROM amazoncorretto:${VERSION}
RUN mkdir /src
COPY out/artifacts/GitDemo_jar/GitDemo.jar /src
WORKDIR /src
CMD ["java","-jar","GitDemo.jar"]
