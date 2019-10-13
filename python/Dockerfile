FROM python:3-alpine
# Install git
RUN apk update && apk add git

# Create appuser
RUN adduser -D -g '' appuser

LABEL maintainer="Nguyen Nguyen <nguyenbk92@gmail.com>"
# Set the working directory to /app
WORKDIR /app


# Copy the current directory contents into the container at /app
COPY ./ /app/
RUN python --version
RUN python3 -m unittest tests/*_test.py -v
