FROM alpine:3.16.2

LABEL maintainer = "Carlos Alexis Galaviz Rosas <carlosalexis.galavizrosas@gmail.com>"

USER root
COPY . /usr/src/app
WORKDIR /usr/src/app

RUN apk update && apk add gradle

RUN gradle build -x test

CMD ["java", "-jar", "/usr/src/app/build/libs/rex-api-0.0.1-SNAPSHOT.jar"]