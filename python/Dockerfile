FROM python:3-alpine
# Install git
RUN apk update && apk add git

RUN apk update && apk upgrade && pip install -U pip
RUN apk add --update alpine-sdk make gcc python3-dev python-dev libxslt-dev libxml2-dev libc-dev openssl-dev libffi-dev zlib-dev py-pip openssh \
    && rm -rf /var/cache/apk/*

# Create appuser
RUN adduser -D -g '' appuser

LABEL maintainer="Nguyen Nguyen <nguyenbk92@gmail.com>"
# Set the working directory to /app
WORKDIR /app


# Copy the current directory contents into the container at /app
COPY ./ /app/python

RUN cd python && python -m unittest discover -s ./tests  -p '*_test.py'