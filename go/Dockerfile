FROM golang:latest 

LABEL maintainer="Nguyen Nguyen <nguyenbk92@gmail.com>"
# Set the working directory to /app
WORKDIR /app
RUN  apk add --update \
    git \
    bash \
    make \
    g++

ENV GOLANG_VERSION 1.11.1


ENV GOPATH /go
ENV PATH $GOPATH/bin:/usr/local/go/bin:$PATH


# Copy the current directory contents into the container at /app
COPY go /app/go/

RUN go test ./go/topics/cards
