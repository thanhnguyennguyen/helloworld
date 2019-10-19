FROM python:3.7.4-alpine
# Install git
RUN apk update && apk add git && apk add bash

# Create appuser
RUN adduser -D -g '' appuser

LABEL maintainer="Nguyen Nguyen <nguyenbk92@gmail.com>"
# Set the working directory to /app
WORKDIR /app


# Copy the current directory contents into the container at /app
COPY ./ /app/
RUN python --version
RUN pwd && ls
RUN cd python/tests && python3  -m unittest discover  -p '*_test.py' -v
