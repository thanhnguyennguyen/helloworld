FROM alpine:3.8

LABEL maintainer="Nguyen Nguyen <nguyenbk92@gmail.com>"
# Set the working directory to /app
WORKDIR /app

ENV GOLANG_VERSION 1.11.1

RUN  apk add --update \
    git \
    bash \
    make \
    g++

# Copy the current directory contents into the container at /app
COPY go /app/go/

RUN go test ./ topics/cards
