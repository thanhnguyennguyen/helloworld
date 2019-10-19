# STEP 1 build executable binary
FROM golang:alpine as builder
# Install git
RUN apk update && apk add git && apk add bash 
# Create appuser
RUN adduser -D -g '' appuser

LABEL maintainer="Nguyen Nguyen <nguyenbk92@gmail.com>"
# Set the working directory to /app
WORKDIR /app

ENV GOLANG_VERSION 1.11.1


ENV GOPATH /go
ENV PATH $GOPATH/bin:/usr/local/go/bin:$PATH


# Copy the current directory contents into the container at /app
COPY go /app/go/

RUN go test ./go/topics/cards
